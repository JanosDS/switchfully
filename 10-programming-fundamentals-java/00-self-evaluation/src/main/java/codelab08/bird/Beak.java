package codelab08.bird;

public enum Beak {
	SMALL("Small"),
	MEDIUM("Medium"),
	LARGE("Large");

	private String size;

	Beak(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}
}
