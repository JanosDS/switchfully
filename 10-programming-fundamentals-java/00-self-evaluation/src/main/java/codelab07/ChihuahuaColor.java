package codelab07;

public enum ChihuahuaColor {
	BROWN("Brown"),
	BLACK("Black"),
	WHITE("White");


	private String value;

	ChihuahuaColor(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
