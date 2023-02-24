package basic.codelab02.plants;

import basic.codelab02.plants.growable.GrowStage;
import basic.codelab02.plants.growable.Growable;

public class Plant implements Growable {

	private GrowStage growStage;

	public Plant() {
		growStage = GrowStage.SEED;
	}

	public Plant(GrowStage growStage) {
		this.growStage = growStage;
	}

	@Override
	public void grow() {
		this.growStage = growStage.grow();
	}

	@Override
	public GrowStage getGrowStage() {
		return growStage;
	}

}
