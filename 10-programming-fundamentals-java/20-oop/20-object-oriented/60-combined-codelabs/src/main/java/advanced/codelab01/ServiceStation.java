package advanced.codelab01;

import advanced.codelab01.bus.Bus;
import advanced.codelab01.bus.LiquidFuelBus;
import advanced.codelab01.bus.fuel.ElectricFuel;

public class ServiceStation {

	public String refuelElectric(ElectricFuel bus) {
		return bus.recharge();
	}

	public String refuelLiquid(LiquidFuelBus bus) {
		return bus.refuel();
	}

	public String refuelAny(Bus bus) {
		return bus.refuel();
	}
}
