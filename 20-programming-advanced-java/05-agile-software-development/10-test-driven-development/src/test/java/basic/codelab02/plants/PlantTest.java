package basic.codelab02.plants;

import basic.codelab02.plants.growable.GrowStage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {


	@Nested
	@DisplayName("Plant grow tests")
	class Growables {
		private Plant plant;

		@BeforeEach
		void setupPlant() {
			plant = new Plant();
		}

		@Test
		@DisplayName("New plant starts as seed")
		void newPlant_StartAsSeed() {
			assertEquals(GrowStage.SEED, plant.getGrowStage());
		}

		@Test
		@DisplayName("Given plant, grow to next stage")
		void givenPlant_GrowSeedToSprout() {
			plant.grow();
			assertEquals(GrowStage.SPROUT, plant.getGrowStage());
		}

		@Test
		@DisplayName("Given plant - growstage tree -> grow stays tree")
		void givenTree_staysTree() {
			Plant tree = new Plant(GrowStage.TREE);
			tree.grow();
			assertEquals(GrowStage.TREE, tree.getGrowStage());
		}
	}

}
