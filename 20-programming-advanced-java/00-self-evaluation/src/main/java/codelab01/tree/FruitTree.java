package codelab01.tree;

import codelab01.fruit.Fruit;
import codelab01.height.Height;

import java.util.ArrayList;
import java.util.List;

public class FruitTree extends Tree {

	private final int MAX_FRUIT_PER_TREE = 10;
	private List<Fruit> fruitItems = new ArrayList<>();


	public FruitTree(Height height, TreeType treeType, int age) {
		super(height, treeType, age);
	}

	public void harvestFruit() {
		fruitItems.clear();
	}

	public void addFruit(Fruit fruit) {
		if (fruitItems.size() < MAX_FRUIT_PER_TREE) {
			fruitItems.add(fruit);
		}
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append(super.toString());
		strb.append("\n this tree has ").append(fruitItems.size()).append("fruits");

		return strb.toString();
	}
}
