package codelab09.computerParts.processor;

import codelab09.computerParts.ComputerPart;

public class Processor extends ComputerPart {

	private ProcessorMode processorMode;
	private String name;

	public Processor(String name, ProcessorMode processorMode) {
		super(100);
		this.name = name;
		this.processorMode = processorMode;
	}

	public void switchMode(ProcessorMode newMode) {
		if (processorMode.canSwitchMode(newMode)) {
			this.processorMode = newMode;
		}
	}

	@Override
	public String toString() {
		return "Processor: <" + name + "> Mode: " + processorMode.getMode();
	}
}
