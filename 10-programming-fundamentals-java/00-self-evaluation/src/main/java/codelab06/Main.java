package codelab06;

import codelab06.card.Card;
import codelab06.card.Suit;
import codelab06.card.Value;

public class Main {
	public static void main(String[] args) {

		Card card = new Card(Suit.HEARTS, Value.ACE);

		Deck deck = new Deck();
		System.out.println(deck.toString());
		if (deck.contains(card)) {
			System.out.println("The deck contains " + card.toString());
		}
		System.out.println(deck.getAmountOfCards());
		deck.fillDeck();
		System.out.println(deck.getAmountOfCards());
		System.out.println(deck.toString());
		System.out.println(card.toLongString());
	}
}
