package codelab09.computerParts.processor;

public enum ProcessorMode {
	ENERGY_SAVING("Energy-saving"),
	NORMAL("Normal"),
	OVERCLOCKED("Overclocked");

	private String mode;

	ProcessorMode(String mode) {
		this.mode = mode;
	}

	public String getMode() {
		return mode;
	}

	public boolean canSwitchMode(ProcessorMode newMode) {
		if (this == ENERGY_SAVING && newMode == NORMAL) {
			return true;
		}
		if (this == NORMAL && (newMode == ENERGY_SAVING || newMode == OVERCLOCKED)) {
			return true;
		}
		if (this == OVERCLOCKED && newMode == NORMAL) {
			return true;
		}
		return false;
	}
}
