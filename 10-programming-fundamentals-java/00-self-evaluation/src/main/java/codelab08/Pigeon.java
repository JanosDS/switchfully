package codelab08;

public class Pigeon extends Bird implements Flyable {

	private static final int MAX_FLY_HEIGHT = 750;
	private static final int MIN_FLY_HEIGHT = 500;

	private int maxFlyHeight;

	public Pigeon() {
		super(Beak.MEDIUM);
	}

	public Pigeon(int maxFlyHeight) {
		super(Beak.MEDIUM);
		setMaxFlyHeight(maxFlyHeight);
	}

	@Override
	public void setMaxFlyHeight(int height) {
		if (height < MIN_FLY_HEIGHT) {
			this.maxFlyHeight = MIN_FLY_HEIGHT;
		} else if (height > MAX_FLY_HEIGHT) {
			this.maxFlyHeight = MAX_FLY_HEIGHT;
		} else {
			this.maxFlyHeight = height;
		}
	}

	@Override
	public int getMaxFlyHeight() {
		return maxFlyHeight;
	}

	@Override
	public String fly() {
		return "Flap flap... oeh, look, breadcrumbs!";
	}
}
