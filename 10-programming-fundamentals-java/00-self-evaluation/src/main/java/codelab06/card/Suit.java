package codelab06.card;

public enum Suit {
	SPADES("Spades", "S", "Black"),
	DIAMONDS("Diamonds", "D", "Red"),
	HEARTS("Hearts", "H", "Red"),
	CLUBS("Clubs", "C", "Black");

	private String color;
	private String shortVal;
	private String value;

	Suit(String value, String shortVal, String color) {
		this.value = value;
		this.shortVal = shortVal;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getShortVal() {
		return shortVal;
	}

	public String getValue() {
		return value;
	}
}
