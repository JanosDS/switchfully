package codelab07;

public class Labrador extends Dog {
	private static final int AVG_WEIGHT = 35;
	private final String BARK_SOUND = "WOOF WOOF!";

	public Labrador(String name) {
		super(name);
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
		return "Labrador: (name = " + super.getName() + ", sound = " + BARK_SOUND + ", average breed weight = " + AVG_WEIGHT + ")";
	}
}
