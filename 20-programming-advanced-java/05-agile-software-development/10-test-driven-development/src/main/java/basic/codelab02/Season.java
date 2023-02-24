package basic.codelab02;

import basic.codelab02.plants.growable.GrowStage;

public enum Season {
	WINTER,
	SPRING,
	SUMMER,
	FALL {
		@Override
		public Season nextSeason() {
			return values()[0]; // rollover to the first
		}
	};

	public Season nextSeason() {
		return values()[ordinal() + 1]; //returns the next enum value
	}
}
