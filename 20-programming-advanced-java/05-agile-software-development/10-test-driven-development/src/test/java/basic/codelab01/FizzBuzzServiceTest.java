package basic.codelab01;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class FizzBuzzServiceTest {

	@Nested
	@DisplayName("Array maker tests")
	class ArrayMaker {
		private FizzBuzzService fizzBuzzService;

		@BeforeEach
		void setupFizzBuzzService() {
			this.fizzBuzzService = new FizzBuzzService();
		}

		@Test
		@DisplayName("Given a number x, return an array from one to x ")
		void givenANumberX_returnArrayOfNumbersFromOneToX() {
			String[] result = fizzBuzzService.createArrayFromOneTo(7);
			String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"};
			Assertions.assertArrayEquals(result, expectedResult);
		}

		@Test
		@DisplayName("Given a number x smaller than one, return an illegal argument exception ")
		void givenANumberXSmallerThanOne_returnIllegalArgumentException() {
			IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
				fizzBuzzService.createArrayFromOneTo(0);
			});
		}

		@Test
		@DisplayName("Given a number 15, return an array from one to x ")
		void givenANumber15_returnArrayOfNumbersFromOneTo15() {
			String[] result = fizzBuzzService.createArrayFromOneTo(15);
			String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
			Assertions.assertArrayEquals(result, expectedResult);
		}
	}

}