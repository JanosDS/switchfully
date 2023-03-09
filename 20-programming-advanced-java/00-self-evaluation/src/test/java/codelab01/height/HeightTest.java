package codelab01.height;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {


	@Nested
	class HeightConvertToFeetTests {
		@Test
		@DisplayName("Convert height in meters to feet")
		void whenGivenHeightInMeters_convertToFeet() {
			Height heightInMeter = new Height(30, HeightUnit.METER);
			Height heightInFeet = Height.convertMeterToFeet(heightInMeter);
			Assertions.assertEquals(98.42, heightInFeet.getHeightAmount());
		}

		@Test
		@DisplayName("Convert height in feet to feet - throw exception")
		void whenGivenHeightInFeet_convertToFeet_throwException() {
			Height heightInMeter = new Height(30, HeightUnit.FOOT);

			Exception exception = assertThrows(IllegalArgumentException.class, () -> {
				Height heightInFeet = Height.convertMeterToFeet(heightInMeter);
			});
		}
	}


	@Nested
	class HeightConvertToMeterTests {
		@Test
		@DisplayName("Convert height in feet to meter")
		void whenGivenHeightInFeet_convertToMeter() {
			Height heightInFeet = new Height(30, HeightUnit.FOOT);
			Height heightInMeter = Height.convertFeetToMeter(heightInFeet);
			Assertions.assertEquals(9.15, heightInMeter.getHeightAmount());
		}

		@Test
		@DisplayName("Convert height in meter to meter - throw exception")
		void whenGivenHeightInMeter_convertToMeter_throwException() {
			Height heightInFeet = new Height(30, HeightUnit.METER);

			Exception exception = assertThrows(IllegalArgumentException.class, () -> {
				Height heightInMeter = Height.convertFeetToMeter(heightInFeet);
			});
		}
	}
}