package basic.codelab02;

import java.time.LocalTime;

public class Human {

	private boolean isVampire;

	public Human() {
		this.isVampire = false;
	}

	public void setVampire() {
		this.isVampire = true;
	}

	public boolean isVampire() {
		return this.isVampire;
	}

	public void bite(Human human, LocalTime time) {
		if (isVampire && !time.isBefore(LocalTime.of(0, 0, 0)) && time.isBefore(LocalTime.of(7, 0, 0))) {
			human.setVampire();
		}
	}
}
