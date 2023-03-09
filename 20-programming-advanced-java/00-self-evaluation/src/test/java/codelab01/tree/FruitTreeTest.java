package codelab01.tree;

import codelab01.fruit.Fruit;
import codelab01.fruit.FruitType;
import codelab01.height.Height;
import codelab01.height.HeightUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FruitTreeTest {

	@Test
	void cannnotAddWrongFruit() {
		FruitTree appleTree = new FruitTree(new Height(5, HeightUnit.METER), TreeType.APPLE_TREE, 2);
		appleTree.addFruit(new Fruit(FruitType.ORANGE, Color.orange));
		int expected = 0;
		int result = appleTree.getAmountOfFruit();
		Assertions.assertEquals(expected, result);
	}

	@Test
	void canAddFruit() {
		FruitTree appleTree = new FruitTree(new Height(5, HeightUnit.METER), TreeType.APPLE_TREE, 2);
		appleTree.addFruit(new Fruit(FruitType.APPLE, Color.orange));
		int expected = 1;
		int result = appleTree.getAmountOfFruit();
		Assertions.assertEquals(expected, result);
	}
}