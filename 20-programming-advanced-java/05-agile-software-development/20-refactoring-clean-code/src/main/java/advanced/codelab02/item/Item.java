package advanced.codelab02.item;

public class Item {

	protected final int MAX_QUALITY = 50;
	private String name;
	protected int sellIn;
	protected int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public int getQuality() {
		return quality;
	}

	public void updateQuality() {
		if (quality > 0) {
			if (sellIn > 0) {
				quality--;
			} else {
				quality -= 2;
			}
		}
		sellIn--;
	}


	public void setQuality(int quality) {
		this.quality = quality;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}

}
