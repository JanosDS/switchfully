package codelab08;

import codelab08.bird.Eagle;
import codelab08.bird.behavior.Flyable;
import codelab08.bird.Pigeon;

public class BirdRunner {
	public static void main(String[] args) {

		Flyable[] flyBirds = {
				new Eagle(4123),
				new Pigeon(666)
		};
		Sky.letBirdsFly(flyBirds);
	}
}
