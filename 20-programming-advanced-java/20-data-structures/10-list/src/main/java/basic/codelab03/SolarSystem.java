package basic.codelab03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SolarSystem {

	private List<String> planets = new ArrayList<>();

	public void addPlanet(String planet) {
		planets.add(planet);
	}

	public void addPlanetAtIndex(String planet, int index) {
		planets.add(index, planet);
	}

	public void removePlanet(String planet) {
		planets.remove(planet);
	}

	public void replacePlanetOnIndex(String planet, int index) {
		planets.set(index, planet);
	}

	public void swapPlanetsOnIndex(int index1, int index2) {
		String tempPlanet = planets.get(index1);
		planets.set(index1, planets.get(index2));
		planets.set(index2, tempPlanet);
	}

	public void reversPlanetsOrder() {
		Collections.reverse(planets);
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("SolarSystem: ");

		Iterator<String> iterator = planets.iterator();
		while (iterator.hasNext()) {
			strb.append(iterator.next());
			if (iterator.hasNext()) {
				strb.append(", ");
			}
		}
		return strb.toString();
	}
}
