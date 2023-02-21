package codelab09.peripherals;

public class KeyBoard extends Peripheral {

	private KeySwitches keySwitches;

	private boolean hasSeperateNumPad;

	public KeyBoard(KeySwitches keySwitches, boolean hasSeperateNumPad) {
		this.keySwitches = keySwitches;
		this.hasSeperateNumPad = hasSeperateNumPad;
	}

	@Override
	public String use() {
		return "Tokkel tokkel tokkel!";
	}

	@Override
	public String toString() {
		return "KeyBoard { " +
				"keySwitches=" + keySwitches +
				", hasSeperateNumPad=" + hasSeperateNumPad +
				" }";
	}
}
