package basic.codelab01;

public class PowerplantOperator {

	public static void main(String[] args) {
		// Your code here
		try {
			NuclearPowerplant plant = new NuclearPowerplant();
			System.out.println(plant.increasePower(77));
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		try {

			NuclearPowerplant plant2 = new NuclearPowerplant();
			System.out.println(plant2.increasePower(11));
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

	}

}
