package advanced.codelab01.bus;

import java.util.UUID;

public abstract class Bus {
	private final UUID ID = UUID.randomUUID();

	public abstract String refuel();

}
