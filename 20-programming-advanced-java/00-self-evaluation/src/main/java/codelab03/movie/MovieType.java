package codelab03.movie;

public enum MovieType {
	CHILDRENS(2),
	NEW_RELEASE(1),
	REGULAR(0);


	private final int priceCode;


	MovieType(int priceCode) {
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}
}
