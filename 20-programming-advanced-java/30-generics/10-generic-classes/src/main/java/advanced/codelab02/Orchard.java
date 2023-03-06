package advanced.codelab02;

import advanced.codelab02.Fruit.Apple;
import advanced.codelab02.Fruit.Fruit;
import advanced.codelab02.Fruit.Orange;

public class Orchard {
	public static void main(String[] args) {
		FruitTree<Apple> appleTree = new FruitTree<>(5);
		appleTree.addFruit(new Apple());

		FruitTree<Orange> orangeTree = new FruitTree<>(3);
		orangeTree.addFruit(new Orange());

		FruitTree<Fruit> randomFruitTree = new FruitTree<>(5);
		randomFruitTree.addFruit(new Apple());
		randomFruitTree.addFruit(new Orange());

		System.out.println(randomFruitTree.getFruits().size());

		FruitTree<String> stringTree = new FruitTree<>(4);
		stringTree.addFruit("Apple");
		System.out.println(stringTree.getFruits().get(0));

	}
}
