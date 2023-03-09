package codelab01.tree;

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

	@Override
	public String toString() {
		return name;
	}
}
