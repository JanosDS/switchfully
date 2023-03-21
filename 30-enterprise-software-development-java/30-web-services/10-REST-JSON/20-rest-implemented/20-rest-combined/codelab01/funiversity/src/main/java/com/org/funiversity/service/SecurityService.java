package com.org.funiversity.service;


import com.org.funiversity.domain.user.Feature;
import com.org.funiversity.domain.user.User;
import com.org.funiversity.domain.user.UsernamePassword;
import com.org.funiversity.exception.authenticationException.UnauthorizatedException;
import com.org.funiversity.exception.authenticationException.UserNotFoundException;
import com.org.funiversity.exception.authenticationException.WrongPasswordException;
import com.org.funiversity.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class SecurityService {

	private final UserRepository userRepository;

	public SecurityService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void validateAuthorization(String auth, Feature feature) {
		UsernamePassword usernamePassword = getUsernamePassword(auth);

		User user = userRepository.findUserForUsername(usernamePassword.getUsername())
				.orElseThrow(() -> new UserNotFoundException("No user found with username: " + usernamePassword.getUsername()));

		if (!user.doesPasswordMatch(usernamePassword.getPassword())) {
			throw new WrongPasswordException("Wrong password for user used.");
		}
		if (!user.hasAccessTo(feature)) {
			throw new UnauthorizatedException("User has no access to this feature.");
		}
	}

	private UsernamePassword getUsernamePassword(String auth) {
		String decodedUsernamePassword = new String(Base64.getDecoder().decode(auth.substring("basic ".length())));
		String username = decodedUsernamePassword.substring(0, decodedUsernamePassword.indexOf(":"));
		String password = decodedUsernamePassword.substring(decodedUsernamePassword.indexOf(":") + 1);
		return new UsernamePassword(username, password);
	}

}
