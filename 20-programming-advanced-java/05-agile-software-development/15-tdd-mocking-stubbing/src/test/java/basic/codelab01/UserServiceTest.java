package basic.codelab01;

import basic.codelab01.domain.User;
import basic.codelab01.domain.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
//@RunWith(MockitoJUnitRunner.class) JUNIT 4
class UserServiceTest {

	@Mock
	private UserRepository userRepository;
	@InjectMocks
	private UserService userService;

	public static final User USER_A = new User("a");
	public static final User USER_B = new User("b");


	@Test
	void addUser_addsUserInUserRepository() {
		userService.addUser(USER_A);

		Mockito.verify(userRepository, times(1)).add(USER_A);
	}

	@Test
	void getUser_userPresent_returnsUser() {
		when(userRepository.getForId(USER_A.getId())).thenReturn(USER_A);

		User actual = userService.getUser(USER_A.getId());

		Assertions.assertThat(actual).isEqualTo(USER_A);
	}

	@Test
	void getUser_userAbsent_returnsNull() {
		User actual = userService.getUser(USER_A.getId());

		Assertions.assertThat(actual).isNull();
	}

	@Test
	void getUsersSortedOnNicknameAsc() {
		when(userRepository.getAll()).thenReturn(List.of(USER_B, USER_A));

		List<User> actual = userService.getUsersSortedOnNicknameAsc();

		Assertions.assertThat(actual).containsExactlyElementsOf(List.of(USER_A, USER_B));
	}

	@Test
	void getUsersSortedOnNicknameAsc_noUsers_returnsEmptyList() {
		when(userRepository.getAll()).thenReturn(emptyList());

		List<User> actual = userService.getUsersSortedOnNicknameAsc();

		Assertions.assertThat(actual).isEmpty();
	}
}