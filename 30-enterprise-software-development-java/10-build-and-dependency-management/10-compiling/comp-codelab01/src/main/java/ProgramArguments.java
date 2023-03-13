public class ProgramArguments {
	public static void main(String[] args) {
		printArray(args);
	}

	static void printArray(String[] strings) {
		System.out.println("Program arguments:");
		if (strings != null && strings.length != 0) {
			for (int i = 0; i < strings.length; i++) {
				System.out.println(i + ":" + strings[i]);
			}
		} else {
			System.out.println("None");
		}
	}
}
