package advanced.codelab02.item;

public class ConjuredItem extends Item {
	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (quality > 0) {
			if (sellIn > 0) {
				quality -= 2;
			} else {
				quality -= 4;
			}
		}
		sellIn--;
	}
}
