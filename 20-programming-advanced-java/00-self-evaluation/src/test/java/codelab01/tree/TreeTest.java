package codelab01.tree;

import codelab01.height.Height;
import codelab01.height.HeightUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

	@Test
	void growSpeedTest() {
		Tree tree = new Tree(new Height(3, HeightUnit.METER), TreeType.OAK, 2);
		double expected = tree.getHeight().getHeightInMeter() + TreeType.OAK.getGrowSpeed();
		tree.grow();
		double result = tree.getHeight().getHeightInMeter();
		Assertions.assertEquals(expected, result);
	}

}