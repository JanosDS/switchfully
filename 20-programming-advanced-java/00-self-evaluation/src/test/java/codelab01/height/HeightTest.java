package codelab01.height;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {


	@Test
	void getHeightInMeter_whenHeightIsFeet() {
		Height height = new Height(1, HeightUnit.FOOT);
		Assertions.assertEquals(0.31, height.getHeightInMeter());
	}

	@Test
	void getHeightInFeet_whenHeightIsMeter() {
		Height height = new Height(1, HeightUnit.METER);
		Assertions.assertEquals(3.29, height.getHeightInFeet());
	}
}