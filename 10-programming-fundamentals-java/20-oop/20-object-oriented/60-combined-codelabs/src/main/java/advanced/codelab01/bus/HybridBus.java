package advanced.codelab01.bus;

import advanced.codelab01.bus.fuel.ElectricFuel;
import advanced.codelab01.bus.fuel.LiquidFuel;

public class HybridBus extends Bus implements LiquidFuel, ElectricFuel {

	@Override
	public String refuel() {
		return "Filling up my small tank! Filling up my small batteries!";
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
