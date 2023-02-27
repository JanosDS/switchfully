package basic.codelab03;

public class SystemRunner {

	public static void main(String[] args) {
		SolarSystem solar = new SolarSystem();
		solar.addPlanet("Earth");
		solar.addPlanet("Jupiter");

		System.out.println(solar);
	}
}
