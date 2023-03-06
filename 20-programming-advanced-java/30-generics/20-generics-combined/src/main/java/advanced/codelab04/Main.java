package advanced.codelab04;

import advanced.codelab04.animal.Camel;
import advanced.codelab04.animal.Fish;
import advanced.codelab04.habitat.Habitat;

public class Main {
	public static void main(String[] args) {

		Fish fish = new Fish();
		Camel camel = new Camel();

		Habitat<Fish> ocean = new Habitat<>();
		ocean.addInhabitant(fish);
		//ocean.addInhabitant(camel);

		Habitat<Camel> dessert = new Habitat<>();
		dessert.addInhabitant(camel);
	}
}
