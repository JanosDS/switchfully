package advanced.codelab01.bus;

import advanced.codelab01.bus.fuel.ElectricFuel;
import advanced.codelab01.bus.fuel.LiquidFuel;

public class LiquidFuelBus extends Bus implements LiquidFuel {
	@Override
	public String refuel() {
		return "Filling up my tank!";
	}
}
