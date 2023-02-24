package basic.codelab02;

import basic.codelab02.plants.Plant;
import basic.codelab02.plants.growable.GrowStage;
import basic.codelab02.plants.growable.Growable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegionTest {

	@Nested
	@DisplayName("Season tests")
	class Seasons {
		@Test
		@DisplayName("Winter to spring ")
		void region_seasonWinterToSpring() {
			Region region = new Region(Season.WINTER);
			region.nextSeason();
			assertEquals(Season.SPRING, region.getSeason());
		}

		@Test
		@DisplayName("Spring to Summer ")
		void region_seasonSpringToSummer() {
			Region region = new Region(Season.SPRING);
			region.nextSeason();
			assertEquals(Season.SUMMER, region.getSeason());
		}

		@Test
		@DisplayName("Summer to Fall")
		void region_seasonSummerToFall() {
			Region region = new Region(Season.SUMMER);
			region.nextSeason();
			assertEquals(Season.FALL, region.getSeason());
		}

		@Test
		@DisplayName("Fall to Winter ")
		void region_seasonFallToWinter() {
			Region region = new Region(Season.FALL);
			region.nextSeason();
			assertEquals(Season.WINTER, region.getSeason());
		}
	}


	@Nested
	@DisplayName("Adding growables to the region")
	class AddGrowables {
		private Region region;

		@BeforeEach
		void setupRegion() {
			region = new Region(Season.WINTER);
		}

		@Test
		@DisplayName("Add a new plant to the region, with space left")
		void regionHasSpace_addPlant() {
			ArrayList<Growable> expectedPlants = new ArrayList<>();
			Plant plant = new Plant();
			expectedPlants.add(plant);
			region.addPlant(plant);
			assertEquals(expectedPlants, region.getPlants());
		}

		@Test
		@DisplayName("Add a new plant to the region, with no space left")
		void regionHasNoSpace_dontAddPlant() {
			ArrayList<Growable> expectedPlants = new ArrayList<>();
			Plant plant = new Plant();
			expectedPlants.add(plant);
			expectedPlants.add(plant);
			expectedPlants.add(plant);
			expectedPlants.add(plant);
			expectedPlants.add(plant);
			region.addPlant(plant);
			region.addPlant(plant);
			region.addPlant(plant);
			region.addPlant(plant);
			region.addPlant(plant);
			region.addPlant(plant);
			assertEquals(expectedPlants, region.getPlants());
		}
	}

	@Nested
	@DisplayName("Growables in region test grow")
	class Growables {
		private Region region;

		@Test
		@DisplayName("Advance all growables to next growstage on season change, in region with broadleaf vegetation")
		void whenSeasonChange_AdvanceGrowStageOfGrowables_VegetationBroadleaf() {
			region = new Region(Season.WINTER, Vegetation.BROADLEAF);
			addPlantToRegion();
			region.nextSeason();
			assertEquals(GrowStage.SPROUT, region.getPlants().get(0).getGrowStage());
		}

		@Test
		@DisplayName("Advance all growables to next growstage on season change, in region with rainforrest vegetation")
		void whenSeasonChange_AdvanceGrowStageOfGrowables_VegetationRainForrest() {
			region = new Region(Season.WINTER, Vegetation.RAINFOREST);
			addPlantToRegion();
			region.nextSeason();
			assertEquals(GrowStage.PLANT, region.getPlants().get(0).getGrowStage());
		}

		@Test
		@DisplayName("Advance all growables to next growstage on season change, in region with steppe vegetation")
		void whenSeasonChange_AdvanceGrowStageOfGrowables_VegetationSteppe() {
			region = new Region(Season.WINTER, Vegetation.STEPPE);
			addPlantToRegion();
			region.nextSeason();
			assertEquals(GrowStage.SEED, region.getPlants().get(0).getGrowStage());
		}

		private void addPlantToRegion() {
			Plant plant = new Plant();
			region.addPlant(plant);
		}
	}
}
