package codelab06;

import codelab06.card.Card;
import codelab06.card.Suit;
import codelab06.card.Value;

import java.util.ArrayList;

public class Deck {

	ArrayList<Card> cards = new ArrayList<>();

	public Deck() {
		this.cards.add(new Card(Suit.HEARTS, Value.ACE));
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

	public int getAmountOfCards() {
		return cards.size();
	}

	public void fillDeck() {
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				Card newCard = new Card(suit, value);
				if (!contains(newCard)) {
					cards.add(newCard);
				}
			}
		}
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
