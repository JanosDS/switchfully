package codelab06;

public class Main {
	public static void main(String[] args) {

		Card card = new Card(Suit.HEARTS, 1);

		Deck deck = new Deck();
		System.out.println(deck.toString());
		if (deck.contains(card)) {
			System.out.println("The deck contains " + card.toString());
		}

	}
}
