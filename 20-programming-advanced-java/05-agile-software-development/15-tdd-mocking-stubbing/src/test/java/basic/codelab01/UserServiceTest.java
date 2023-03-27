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
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

class UserServiceTest {

	private UserRepository userRepositoryMock;
	private UserService userService;

	@BeforeEach
	void setupUserService() {
		this.userRepositoryMock = Mockito.mock(UserRepository.class);
		this.userService = new UserService(userRepositoryMock);
	}

	@Test
	void getUser_givenUserId_thenReturnAUser() {
		final UUID userId = UUID.randomUUID();
//		Mockito.when(userRepositoryMock.getForId(userId))
//				.thenReturn(new User("Janos"));
		User actualUser = userService.getUser(userId);
//		Assertions.assertEquals("Janos", actualUser.getNickname());
		
		userService.addUser(actualUser);
		Mockito.verify(userRepositoryMock, times(1)).add(actualUser);

	}

	@Test
	void addUser_givenUser_thenAddToDb() {
		final User user = new User("Janos");
		final UUID userId = UUID.randomUUID();
		Mockito.when(userRepositoryMock.getForId(userId))
				.thenReturn(user);
		userService.addUser(user);
		Assertions.assertEquals(user, userService.getUser(userId));
	}

	@Test
	void getUsersSortedOnNicknameAsc() {
		final List<User> userList = new ArrayList<>() {{
			add(new User("Janos"));
			add(new User("Adam"));
			add(new User("Burt"));
			add(new User("Zorro"));
		}};
		List<User> userListSorted = userList.stream()
				.sorted(Comparator.comparing(User::getNickname))
				.toList();

		Mockito.when(userRepositoryMock.getAll())
				.thenReturn(userList);
		Assertions.assertEquals(userListSorted, userService.getUsersSortedOnNicknameAsc());
	}

}