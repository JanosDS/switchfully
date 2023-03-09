package codelab01.tree;

import codelab01.fruit.Fruit;
import codelab01.fruit.FruitType;

public enum TreeType {

	APPLE_TREE("Apple tree", 0.6, true),
	OAK("Oak tree", 0.5, false),
	WEEPING_WILLOW("Weeping Willow", 0.1, false),
	FIR("Fir tree", 1.2, false),
	ORANGE_TREE("Orange tree", 0.3, true),
	BULA_YAKA_TREE("Bula Yaka tree", 0.8, true);

	private double growSpeed;
	private boolean isFruitTree;
	private String name;

	TreeType(String name, double growSpeed, boolean isFruitTree) {
		this.name = name;
		this.growSpeed = growSpeed;
		this.isFruitTree = isFruitTree;
	}

	public double getGrowSpeed() {
		return growSpeed;
	}

	public boolean isFruitTree() {
		return isFruitTree;
	}

	public boolean canHaveFruitType(Fruit fruit) {
		return (this == APPLE_TREE && fruit.getFruitType() == FruitType.APPLE) ||
				(this == ORANGE_TREE && fruit.getFruitType() == FruitType.ORANGE) ||
				(this == BULA_YAKA_TREE && (fruit.getFruitType() == FruitType.BULA || fruit.getFruitType() == FruitType.YAKA));
	}

	@Override
	public String toString() {
		return name;
	}
}
