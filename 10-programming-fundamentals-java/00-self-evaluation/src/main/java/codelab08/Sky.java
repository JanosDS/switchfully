package codelab08;

import codelab08.bird.behavior.Flyable;

public class Sky {

	public static void letBirdsFly(Flyable[] flyBirds) {
		for (Flyable bird : flyBirds) {
			System.out.println(bird.fly());
		}
	}
}
