package basic.codelab01;

public class Train {

	private int hoursDelayed;

	public Train() {
		this.hoursDelayed = 0;
	}

	public Train(int delay) {
		setHoursDelayed(delay);
	}

	public void setHoursDelayed(int hoursDelayed) {
		if (hoursDelayed > 0) {
			this.hoursDelayed = hoursDelayed;
		} else {
			this.hoursDelayed = 0;
		}
	}

	public int getHoursDelayed() {
		return hoursDelayed;
	}

	public String customerSatisfaction() {
		switch (hoursDelayed) {
			case (0):
				return "Nice ‘n’ rolling!";
			case (1):
				return "Just another day at the train …";
			case (2):
				return "This train is annoying me!";
			case (3):
				return "B-u-u-urn it!";
			default:
				throw new IllegalArgumentException("The world explodes");
		}
	}
}
