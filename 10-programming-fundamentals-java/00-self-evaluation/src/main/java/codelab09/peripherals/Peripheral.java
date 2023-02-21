package codelab09.peripherals;

import codelab09.Laptop;

public abstract class Peripheral {

	public abstract String use();

	public void plugIn(Laptop laptop) {
		laptop.addPeripheral(this);
	}
}
