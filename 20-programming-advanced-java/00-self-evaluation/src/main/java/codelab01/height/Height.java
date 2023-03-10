package codelab01.height;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Height {
	private final double heightAmount;
	private final HeightUnit heightUnit;

	public Height(double heightAmount, HeightUnit heightUnit) {
		this.heightAmount = heightAmount;
		this.heightUnit = heightUnit;
	}

	public double getHeightAmount() {
		return this.heightAmount;
	}

	public double getHeightInMeter() {
		if (this.heightUnit == HeightUnit.METER) {
			return this.heightAmount;
		}
		LengthUnitConverter converter = new LengthUnitConverter();
		return converter.convertFeetToMeter(this).getHeightInMeter();
	}

	public double getHeightInFeet() {
		if (this.heightUnit == HeightUnit.FOOT) {
			return this.heightAmount;
		}
		LengthUnitConverter converter = new LengthUnitConverter();
		return converter.convertMeterToFeet(this).getHeightInFeet();
	}

	public HeightUnit getHeightUnit() {
		return heightUnit;
	}

}
