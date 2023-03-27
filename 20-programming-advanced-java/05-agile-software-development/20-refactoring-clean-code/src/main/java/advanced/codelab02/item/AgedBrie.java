package advanced.codelab02.item;

public class AgedBrie extends Item {
	public AgedBrie(int sellIn, int quality) {
		super("Aged Brie", sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (quality < MAX_QUALITY) {
			quality++;
		}
		sellIn--;
	}
}
