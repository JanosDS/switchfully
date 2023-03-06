package advanced.codelab04.habitat;

import advanced.codelab04.animal.Animal;

import java.util.ArrayList;

public class Habitat<T> {

	private ArrayList<T> inhabitants = new ArrayList<>();

	public void addInhabitant(T inhabitant) {
		inhabitants.add(inhabitant);
	}

}
