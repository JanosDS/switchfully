package codelab01.height;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Height {
	private static final double ONE_METER_IN_FEET = 3.280399;
	private static final double ONE_FEET_IN_METER = 0.3048;

	private final double heightAmount;
	private final HeightUnit heightUnit;


	public Height(double heightAmount, HeightUnit heightUnit) {
		this.heightAmount = heightAmount;
		this.heightUnit = heightUnit;
	}

	public static Height convertMeterToFeet(Height height) {
		if (height.getHeightUnit() == HeightUnit.FOOT) {
			throw new IllegalArgumentException("Cannot convert height in foot to foot.");
		} else {

			double heightInFeet = roundTo2Decimals(height.heightAmount * ONE_METER_IN_FEET);
			return new Height(heightInFeet, HeightUnit.FOOT);
		}
	}

	public static Height convertFeetToMeter(Height height) {
		if (height.getHeightUnit() == HeightUnit.METER) {
			throw new IllegalArgumentException("Cannot convert height in meter to meter.");
		} else {
			double heightInFeet = roundTo2Decimals(height.heightAmount * ONE_FEET_IN_METER);
			return new Height(heightInFeet, HeightUnit.METER);
		}
	}

	public double getHeightAmount() {
		return this.heightAmount;
	}

	public double getHeightInMeter() {
		if (this.heightUnit == HeightUnit.METER) {
			return this.heightAmount;
		}
		return convertFeetToMeter(this).heightAmount;
	}

	public double getHeightInFeet() {
		if (this.heightUnit == HeightUnit.FOOT) {
			return this.heightAmount;
		}
		return convertMeterToFeet(this).heightAmount;
	}

	public HeightUnit getHeightUnit() {
		return heightUnit;
	}

	public static double roundTo2Decimals(Double height) {
		BigDecimal roundedHeight = new BigDecimal(height).setScale(2, RoundingMode.CEILING);
		return roundedHeight.doubleValue();
	}
}
