package advanced.codelab02;

import advanced.codelab02.item.Item;

public class GildedRose {

	public Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			item.updateQuality();
		}
	}
}
