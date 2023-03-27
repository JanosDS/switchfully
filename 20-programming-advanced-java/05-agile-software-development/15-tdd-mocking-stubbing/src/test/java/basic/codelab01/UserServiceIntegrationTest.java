package basic.codelab01;

import basic.codelab01.domain.User;
import basic.codelab01.domain.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class UserServiceIntegrationTest {

	private UserService userService;
	private final User user = new User("Janos");
	private final User adam = new User("Adam");


	@BeforeEach
	void setupUserService() {
		this.userService = new UserService(new UserRepository());

	}

	@Test
	void getUser_givenUserId_thenReturnAUser() {
		userService.addUser(user);
		Assertions.assertEquals(user, userService.getUser(user.getId()));
	}


	@Test
	void getUsersSortedOnNicknameAsc() {
		userService.addUser(user);
		userService.addUser(adam);
		List<User> userList = new ArrayList<>() {{
			add(user);
			add(adam);
		}};
		userList = userList.stream().sorted(Comparator.comparing(User::getNickname)).toList();
		Assertions.assertEquals(userList, userService.getUsersSortedOnNicknameAsc());
	}

}
