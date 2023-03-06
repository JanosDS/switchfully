package advanced.codelab02;

public class Main {
	public static void main(String[] args) {
		Pair<String> stringPair = new SimplePair<>("Left", "Right");

		Pair<Integer> integerPair = new SimplePair<>(1, 2);

		Pair<Double> doublePair = new SimplePair<>(4.0, 5.6);

		System.out.println(stringPair.getRight());

	}
}
