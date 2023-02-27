package basic.codelab03.soldier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

	@Test
	@DisplayName("A new soldier has barefists as weapon")
	void newSoldier_WeaponIsBareFists() {
		Soldier soldier = new Soldier();
		assertEquals(Weapon.BARE_FISTS, soldier.getWeapon());
	}

	@Test
	@DisplayName("Fight an enemy soldier, both bare fists")
	void soldier_fightEnemy_weaponsBareFists_andWins() {
		Soldier soldier = new Soldier();
		Soldier enemy = new Soldier();
		Soldier winner = soldier.fight(enemy);
		assertEquals(soldier, winner);
	}

	@Test
	@DisplayName("Specialise soldier")
	void soldier_specialise() {
		Soldier soldier = new Soldier();
		soldier.specialiseSoldier();
		assertEquals(true, soldier.isSpecialised());
	}

	@Test
	@DisplayName("Equip a new unspecialised weapon unspecialised soldier")
	void soldier_equipUnspecialisedWeapon_unspecialisedSoldier() {
		Soldier soldier = new Soldier();
		soldier.equipWeapon(Weapon.AXE);
		assertEquals(Weapon.AXE, soldier.getWeapon());
	}

	@Test
	@DisplayName("Equip a new specialised weapon unspecialised soldier")
	void soldier_equipSpecialisedWeapon_unspecialisedSoldier() {
		Soldier soldier = new Soldier();
		soldier.equipWeapon(Weapon.FLAMING_SWORD);
		assertEquals(Weapon.BARE_FISTS, soldier.getWeapon());
	}

	@Test
	@DisplayName("Equip a new specialised weapon specialised soldier")
	void soldier_equipSpecialisedWeapon_specialisedSoldier() {
		Soldier soldier = new Soldier();
		soldier.specialiseSoldier();
		soldier.equipWeapon(Weapon.FLAMING_SWORD);
		assertEquals(Weapon.FLAMING_SWORD, soldier.getWeapon());
	}
}
