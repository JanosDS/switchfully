package basic.codelab03;

import basic.codelab03.soldier.Soldier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarTest {


	@Test
	@DisplayName("Wage war army1 has 2 soldiers, army2 has 1 soldier")
	void wageWar_ArmyWith2Soldiers_ArmyWith1Soldier() {
		Army army1 = new Army();
		Army army2 = new Army();
		enlistASoldier(army1);
		enlistASoldier(army1);
		enlistASoldier(army2);
		War war = new War();
		assertEquals(army1, war.wageWar(army1, army2));
	}

	private void enlistASoldier(Army army) {
		army.enlist(new Soldier());
	}
}
