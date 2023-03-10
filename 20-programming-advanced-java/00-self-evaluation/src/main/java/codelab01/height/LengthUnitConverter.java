package codelab01.height;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LengthUnitConverter {

	private static final double ONE_METER_IN_FEET = 3.280399;
	private static final double ONE_FEET_IN_METER = 0.3048;

	public Height convertFeetToMeter(Height height) {
		if (height.getHeightUnit() == HeightUnit.METER) {
			throw new IllegalArgumentException("Cannot convert height in meter to meter.");
		} else {
			double heightInFeet = roundTo2Decimals(height.getHeightAmount() * ONE_FEET_IN_METER);
			return new Height(heightInFeet, HeightUnit.METER);
		}
	}

	public Height convertMeterToFeet(Height height) {
		if (height.getHeightUnit() == HeightUnit.FOOT) {
			throw new IllegalArgumentException("Cannot convert height in foot to foot.");
		} else {
			double heightInFeet = roundTo2Decimals(height.getHeightAmount() * ONE_METER_IN_FEET);
			return new Height(heightInFeet, HeightUnit.FOOT);
		}
	}

	private double roundTo2Decimals(Double height) {
		BigDecimal roundedHeight = new BigDecimal(height).setScale(2, RoundingMode.CEILING);
		return roundedHeight.doubleValue();
	}
}
