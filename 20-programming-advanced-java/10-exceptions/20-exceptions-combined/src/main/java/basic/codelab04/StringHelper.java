package basic.codelab04;

public class StringHelper {

	public static String repeatArray(String[] arr, int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Amount to repeat can't be negative.");
		}
		StringBuilder strb = new StringBuilder();
		for (String word : arr) {
			strb.append(word.repeat(amount));
		}
		return strb.toString();
	}

}
