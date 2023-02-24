package basic.codelab02.plants.growable;

public enum GrowStage {
	SEED,
	SPROUT,
	PLANT,
	TREE {
		@Override
		public GrowStage grow() { //Overwrites grow to return tree, if enum is last value (in this case tree)
			return TREE;
		}
	};

	public GrowStage grow() {
		return values()[ordinal() + 1]; //returns the next enum value
	}
}
