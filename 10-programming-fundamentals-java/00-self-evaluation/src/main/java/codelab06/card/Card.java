package codelab06.card;

import java.util.Objects;

public class Card {
	private Suit suit;
	private Value value;

	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	@Override
	public String toString() {
		return suit.getShortVal() + value.getValue();
	}

	public String toLongString() {
		return value.getName() + " of " + suit.getValue();
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
