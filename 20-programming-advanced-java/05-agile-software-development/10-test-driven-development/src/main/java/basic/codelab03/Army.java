package basic.codelab03;

import basic.codelab03.soldier.Soldier;

import java.util.ArrayList;

public class Army {

	ArrayList<Soldier> soldiers = new ArrayList<>();

	public void enlist(Soldier soldier) {
		soldiers.add(soldier);
	}

	public ArrayList<Soldier> getSoldiers() {
		return soldiers;
	}

	public Soldier getFrontMan() {
		if (soldiers.size() > 0) {
			return soldiers.get(0);
		}
		return null;
	}

	public void loseFrontMan() {
		if (soldiers.size() > 0) {
			soldiers.remove(0);
		}
	}

}
