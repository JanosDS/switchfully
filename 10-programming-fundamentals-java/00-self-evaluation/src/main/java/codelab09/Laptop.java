package codelab09;

import codelab09.computerParts.ComputerPart;
import codelab09.peripherals.Peripheral;
import codelab09.computerParts.processor.*;
import codelab09.computerParts.screen.*;
import codelab09.computerParts.storage.*;

import java.util.ArrayList;

public class Laptop {

	private final int MAX_PERIPERALS = 5;

	private Processor processor;
	private Screen screen;
	private Storage storage;

	private ArrayList<Peripheral> peripherals = new ArrayList<>();


	public Laptop(Processor processor, Screen screen, Storage storage) {
		this.processor = processor;
		this.screen = screen;
		this.storage = storage;
	}

	public void switchProcessorMode(ProcessorMode newMode) {
		processor.switchMode(newMode);
	}

	public void addPeripheral(Peripheral peripheral) {
		if (peripherals.size() < MAX_PERIPERALS) {
			peripherals.add(peripheral);
		}
	}

	public void removePeripheral(Peripheral peripheral) {
		peripherals.remove(peripheral);
	}

	public ArrayList<ComputerPart> getParts() {
		ArrayList<ComputerPart> parts = new ArrayList<>();
		parts.add(processor);
		parts.add(screen);
		parts.add(storage);
		return parts;
	}

	public int totalPowerUsage() {
		int powerUsage = 0;
		for (ComputerPart part : getParts()) {
			powerUsage += part.getPowerUsage();
		}
		return powerUsage;
	}

	public String usePeripheral(Peripheral peripheral) {
		return peripheral.use();
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("Laptop specs: ");
		strb.append("\n" + processor.toString());
		strb.append("\n" + screen.toString());
		strb.append("\n" + storage.toString());
		strb.append("\nPowerusage: " + totalPowerUsage() + " kWh");
		strb.append("\n________________________");
		if (peripherals.size() > 0) {
			strb.append("\nHas peripherals: ");
			for (Peripheral peripheral : peripherals) {
				strb.append("\n" + peripheral.toString());
			}
		}

		return strb.toString();
	}
}
