package codelab06;

import java.util.ArrayList;

public class Deck {

	ArrayList<Card> cards = new ArrayList<>();

	public Deck() {
		this.cards.add(new Card(Suit.HEARTS, 1));
	}

	public Deck(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public boolean contains(Card card) {
		if (cards.contains(card)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("Deck: ");
		for (Card card : cards) {
			strb.append(card.toString());
			strb.append(", ");
		}
		return strb.toString();
	}
}
