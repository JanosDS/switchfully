package codelab09.computerParts.screen;

public enum ScreenType {
	LCD("LCD"),
	LED("LED");

	private String type;

	ScreenType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
