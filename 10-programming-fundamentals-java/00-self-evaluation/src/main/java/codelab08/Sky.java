package codelab08;

public class Sky {

	public static void letBirdsFly(Flyable[] flyBirds) {
		for (Flyable bird : flyBirds) {
			System.out.println(bird.fly());
		}
	}
}
