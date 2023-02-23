package codelab05;

import java.util.Arrays;

public class Alarm {
	private final int SOUND_AMOUNT = 3;
	private String sound = "Beep";

	public Alarm() {
	}

	public Alarm(String sound) {
		setSound(sound);
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String[] makeSound() {
		return makeSound(SOUND_AMOUNT);
	}

	public String[] makeSound(int x) {
		String[] soundToMake = new String[x];
		Arrays.fill(soundToMake, this.sound);
		return soundToMake;
	}
}
