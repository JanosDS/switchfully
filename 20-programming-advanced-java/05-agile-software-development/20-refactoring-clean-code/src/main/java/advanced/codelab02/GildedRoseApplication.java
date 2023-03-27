package advanced.codelab02;

import advanced.codelab02.item.AgedBrie;
import advanced.codelab02.item.BackstagePass;
import advanced.codelab02.item.Item;
import advanced.codelab02.item.Sulfuras;

public class GildedRoseApplication {

	public static void main(String[] args) {

		Item[] items = {
				new Item("+5 Dexterity Vest", 10, 20), //
				new AgedBrie(2, 0),
				new Item("Elixir of the Mongoose", 5, 7), //
				new Sulfuras(0, 80),
				new Sulfuras(-1, 80),
				new BackstagePass("A Backstage pass to a TAFKAL80ETC concert", 15, 20),
				new BackstagePass("A Backstage pass to a TAFKAL80ETC concert", 10, 49),
				new BackstagePass("A Backstage pass to a TAFKAL80ETC concert", 5, 49),
				// this conjured item does not work properly yet
				new Item("Conjured Mana Cake", 3, 6)
		};

		GildedRose app = new GildedRose(items);

		int days = 2;
		for (int i = 0; i < days; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.println("name, sellIn, quality");
			for (Item item : items) {
				System.out.println(item);
			}
			System.out.println();
			app.updateQuality();
		}
	}
}
