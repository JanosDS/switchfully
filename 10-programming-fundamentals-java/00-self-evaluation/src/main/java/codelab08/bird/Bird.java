package codelab08.bird;

public abstract class Bird {
	private Beak beak;

	public Bird(Beak beak) {
		this.beak = beak;
	}

	public String getBeakSize() {
		return beak.getSize();
	}
}
