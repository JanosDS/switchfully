package codelab07;

import java.util.Objects;

public abstract class Dog {
	private String name;
	private final String BARK_SOUND = "Woof";

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String bark() {
		return BARK_SOUND;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Dog dog = (Dog) o;
		return Objects.equals(name, dog.name) && Objects.equals(BARK_SOUND, dog.BARK_SOUND);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, BARK_SOUND);
	}
}
