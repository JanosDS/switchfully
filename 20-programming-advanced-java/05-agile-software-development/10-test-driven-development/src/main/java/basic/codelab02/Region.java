package basic.codelab02;

import basic.codelab02.plants.Plant;
import basic.codelab02.plants.growable.Growable;

import java.util.ArrayList;

public class Region {

	private static int MAX_GROWABLES = 5;
	private ArrayList<Growable> plants;
	private Season season;
	private Vegetation vegetation;

	public Region(Season season) {
		this(season, Vegetation.BROADLEAF);
	}

	public Region(Season season, Vegetation vegetation) {
		this.vegetation = vegetation;
		this.season = season;
		this.plants = new ArrayList<>();
	}

	public Season getSeason() {
		return season;
	}

	public void nextSeason() {
		this.season = season.nextSeason();
		for (int amount = 0; amount < vegetation.getGrowthLevel(); amount++) {
			growPlants();
		}
	}

	private void growPlants() {
		for (Growable plant : plants) {
			plant.grow();
		}
	}


	public void addPlant(Plant plant) {
		if (plants.size() < MAX_GROWABLES) {
			plants.add(plant);
		}
	}

	public ArrayList<Growable> getPlants() {
		return plants;
	}
}
