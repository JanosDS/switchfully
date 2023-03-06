package advanced.codelab03;

public class Main {
	public static void main(String[] args) {
		Pair<String, Integer> complexPair = new ComplexPair<>("left", 3);
		System.out.println(complexPair.getRight());
		System.out.println(complexPair.getLeft());
	}
}
