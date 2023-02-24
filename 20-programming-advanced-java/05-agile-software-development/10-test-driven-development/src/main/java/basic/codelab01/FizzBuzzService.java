package basic.codelab01;

public class FizzBuzzService {
	private static int FIZZ_NUMBER = 3;
	private static String FIZZ_STRING = "Fizz";
	private static int BUZZ_NUMBER = 5;
	private static String BUZZ_STRING = "Buzz";

	public String[] createArrayFromOneTo(int i) {
		if (i < 1) {
			throw new IllegalArgumentException("Number needs to be bigger than one");
		}
		String[] array = new String[i];
		for (int index = 0; index < array.length; index++) {
			int number = index + 1;
			array[index] = addFizzBuzz(number);
		}
		return array;
	}

	private String addFizzBuzz(int number) {
		if (number % FIZZ_NUMBER == 0 && number % BUZZ_NUMBER == 0) {
			return FIZZ_STRING + BUZZ_STRING;
		}
		if (number % FIZZ_NUMBER == 0) {
			return FIZZ_STRING;
		} else if (number % BUZZ_NUMBER == 0) {
			return BUZZ_STRING;
		} else {
			return Integer.toString(number);
		}
	}

}
