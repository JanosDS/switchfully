package codelab01.tree;

import codelab01.fruit.Fruit;
import codelab01.fruit.FruitType;

import java.util.ArrayList;
import java.util.List;

public enum TreeType {

	APPLE_TREE("Apple tree", 0.6, true, new ArrayList<FruitType>() {{
		add(FruitType.APPLE);
	}}),
	OAK("Oak tree", 0.5, false, new ArrayList<FruitType>()),
	WEEPING_WILLOW("Weeping Willow", 0.1, false, new ArrayList<FruitType>()),
	FIR("Fir tree", 1.2, false, new ArrayList<FruitType>()),
	ORANGE_TREE("Orange tree", 0.3, true, new ArrayList<FruitType>() {{
		add(FruitType.ORANGE);
	}}),
	BULA_YAKA_TREE("Bula Yaka tree", 0.8, true, new ArrayList<FruitType>() {{
		add(FruitType.BULA);
		add(FruitType.YAKA);
	}});

	private double growSpeed;
	private boolean isFruitTree;
	private String name;

	private List<FruitType> fruitTypes;

	TreeType(String name, double growSpeed, boolean isFruitTree, List<FruitType> fruitTypes) {
		this.name = name;
		this.growSpeed = growSpeed;
		this.isFruitTree = isFruitTree;
		this.fruitTypes = fruitTypes;
	}

	public double getGrowSpeed() {
		return growSpeed;
	}

	public boolean isFruitTree() {
		return isFruitTree;
	}

	public boolean canHaveFruitType(Fruit fruit) {
		return fruitTypes.contains(fruit.getFruitType());
	}

	@Override
	public String toString() {
		return name;
	}
}
