package advanced.codelab01.bus;

import advanced.codelab01.bus.fuel.ElectricFuel;

public class ElectricBus extends Bus implements ElectricFuel {

	@Override
	public String refuel() {
		return "Recharging my batteries!";
	}

	@Override
	public int getVoltage() {
		return 0;
	}

	@Override
	public String recharge() {
		return refuel();
	}
}
