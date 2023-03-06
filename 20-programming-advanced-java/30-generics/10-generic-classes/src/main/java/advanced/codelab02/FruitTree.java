package advanced.codelab02;

import java.util.ArrayList;

public class FruitTree<Fruit> {

	private int age;
	private ArrayList<Fruit> fruits = new ArrayList<Fruit>();


	public FruitTree(int age) {
		this.age = age;
	}

	public void addFruit(Fruit newFruit) {
		fruits.add(newFruit);
	}

	public ArrayList<Fruit> getFruits() {
		return fruits;
	}

}
