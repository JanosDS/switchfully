package codelab08;

public class BirdRunner {
	public static void main(String[] args) {

		Flyable[] flyBirds = {
				new Eagle(4123),
				new Pigeon(666)
		};
		Sky.letBirdsFly(flyBirds);
	}
}
