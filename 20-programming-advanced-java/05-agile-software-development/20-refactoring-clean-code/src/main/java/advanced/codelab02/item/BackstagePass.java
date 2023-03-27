package advanced.codelab02.item;

public class BackstagePass extends Item {
	public BackstagePass(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (quality < MAX_QUALITY) {
			if (sellIn <= 0) {
				quality = 0;
			} else if (sellIn <= 5) {
				quality += 3;
			} else if (sellIn <= 10) {
				quality += 2;
			} else {
				quality++;
			}
		}
		sellIn--;
	}
}
