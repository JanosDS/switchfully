package basic.codelab03;

import basic.codelab03.soldier.Soldier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {
	@Test
	@DisplayName("Enlist soldiers")
	void enlistASlodier() {
		Soldier soldier = new Soldier();
		ArrayList<Soldier> soldiers = new ArrayList<>();
		soldiers.add(soldier);
		Army army = new Army();
		army.enlist(soldier);
		assertEquals(soldiers, army.getSoldiers());
	}

	@Test
	@DisplayName("The frontman is the first enlisted soldier")
	void firstMan_firstEnlistedSoldier() {
		Soldier firstSoldier = new Soldier();
		Soldier secondSoldier = new Soldier();
		Army army = new Army();
		army.enlist(firstSoldier);
		army.enlist(secondSoldier);
		assertEquals(firstSoldier, army.getFrontMan());
	}

	@Test
	@DisplayName("Lose frontman")
	void frontMan_loses() {
		Soldier soldier = new Soldier();
		Army army = new Army();
		army.enlist(soldier);

		army.loseFrontMan();
		assertEquals(new ArrayList<Soldier>(), army.getSoldiers());
	}
}
