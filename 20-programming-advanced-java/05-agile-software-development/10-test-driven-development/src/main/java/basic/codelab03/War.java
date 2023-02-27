package basic.codelab03;

import basic.codelab03.soldier.Soldier;

public class War {

	public Army wageWar(Army army1, Army army2) {
		while (army1.getSoldiers().size() > 0 && army2.getSoldiers().size() > 0) {
			Soldier winner = army1.getFrontMan().fight(army2.getFrontMan());
			if (army1.getSoldiers().contains(winner)) {
				army2.loseFrontMan();
			} else {
				army1.loseFrontMan();
			}
		}
		if (army1.getSoldiers().size() > 0) {
			return army1;
		}
		return army2;
	}
}
