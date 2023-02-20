package codelab07;

public class Chihuahua extends Dog {
	private static final int AVG_WEIGHT = 2;
	private final String BARK_SOUND = "Kefkefkef!";

	private ChihuahuaColor color;

	public Chihuahua(String name, ChihuahuaColor color) {
		super(name);
		this.color = color;
	}

	@Override
	public String bark() {
		return BARK_SOUND;
	}

	public static int getAvgWeight() {
		return AVG_WEIGHT;
	}

	@Override
	public String toString() {
		return "Labrador: (name = " + super.getName() + ", sound = " + BARK_SOUND + ", average breed weight = " + AVG_WEIGHT + ", color =" + color.getValue() + ")";
	}
}
