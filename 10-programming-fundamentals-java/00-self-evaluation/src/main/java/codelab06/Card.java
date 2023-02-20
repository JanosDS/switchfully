package codelab06;

import java.util.Objects;

public class Card {
	private Suit suit;
	private int value;

	public Card(Suit suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	@Override
	public String toString() {
		return suit.getShortVal() + value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Card card = (Card) o;
		return value == card.value && suit == card.suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(suit, value);
	}
}
