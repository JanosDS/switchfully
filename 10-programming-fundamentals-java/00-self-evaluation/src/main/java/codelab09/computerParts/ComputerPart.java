package codelab09.computerParts;

public abstract class ComputerPart {
	private int powerUsage;

	public ComputerPart(int powerUsage) {
		this.powerUsage = powerUsage;
	}

	public int getPowerUsage() {
		return powerUsage;
	}
}
