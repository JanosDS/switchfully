package basic.codelab01;

import basic.codelab01.domain.User;
import basic.codelab01.domain.UserRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceIntegrationTest {

	UserRepository userRepository = new UserRepository();
	UserService userService = new UserService(userRepository);
	User USER_A = new User("A");
	User USER_B = new User("B");

	@Test
	void addUser_addsUserInUserRepository() {
		userService.addUser(USER_A);

		assertThat(userRepository.getForId(USER_A.getId())).isEqualTo(USER_A);
	}

	@Test
	void getUser_userPresent_returnsUser() {
		userRepository.add(USER_A);

		User actual = userService.getUser(USER_A.getId());

		assertThat(actual).isEqualTo(USER_A);
	}

	@Test
	void getUser_userAbsent_returnsNull() {
		User actual = userService.getUser(USER_A.getId());

		assertThat(actual).isNull();
	}

	@Test
	void getUsersSortedOnNicknameAsc() {
		userRepository.add(USER_B);
		userRepository.add(USER_A);

		List<User> actual = userService.getUsersSortedOnNicknameAsc();

		assertThat(actual).containsExactlyElementsOf(List.of(USER_A, USER_B));
	}

	@Test
	void getUsersSortedOnNicknameAsc_noUsers_returnsEmptyList() {
		List<User> actual = userService.getUsersSortedOnNicknameAsc();

		assertThat(actual).isEmpty();
	}
}
