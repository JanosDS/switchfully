package basic.codelab04;

public class StringApplication {
	public static void main(String[] args) {
		try {
			System.out.println(StringHelper.repeatArray(new String[]{"Beep"}, -1));
		} catch (IllegalArgumentException exception) {
			System.err.println(exception.getMessage());
		}
	}
}
