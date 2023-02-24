package basic.codelab02;

public enum Vegetation {
	BROADLEAF(1),
	RAINFOREST(2),
	STEPPE(0);

	private int growthLevel;

	Vegetation(int growthLevel) {
		this.growthLevel = growthLevel;
	}

	public int getGrowthLevel() {
		return growthLevel;
	}
}
