package codelab08.bird;

import codelab08.bird.behavior.Flyable;

public class Eagle extends Bird implements Flyable {
	private static final int MAX_FLY_HEIGHT = 5000;
	private static final int MIN_FLY_HEIGHT = 4000;

	private int maxFlyHeight;

	public Eagle() {
		super(Beak.LARGE);
	}

	public Eagle(int maxFlyHeight) {
		super(Beak.LARGE);
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
		return "I'm soaring through the sky!";
	}
}
