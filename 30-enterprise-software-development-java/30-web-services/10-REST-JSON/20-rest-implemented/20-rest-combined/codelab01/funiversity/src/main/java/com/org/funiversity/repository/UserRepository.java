package com.org.funiversity.repository;

import com.org.funiversity.domain.user.Role;
import com.org.funiversity.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

	private List<User> users;

	public UserRepository() {
		users = new ArrayList<>();
		users.add(new User("Fred", "pwd", Role.ADMIN));
		users.add(new User("Frida", "pwd", Role.PROFESSOR));
	}

	public Optional<User> findUserForUsername(String username) {
		return users.stream()
				.filter(user -> user.getName().equals(username))
				.findFirst();
	}
}
