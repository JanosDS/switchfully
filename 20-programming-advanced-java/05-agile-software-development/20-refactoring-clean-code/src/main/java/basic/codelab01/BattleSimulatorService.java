package basic.codelab01;

/**
 * Read the README.md.
 */
public class BattleSimulatorService {

	private final int DEFENDERS_MODIFIER_BONUS = 2;

	public boolean simBat(Army attackingArmy, Army defendingArmy) {

		if (calculateArmyAttackingStrength(attackingArmy) > (calculateArmyDefendingStrength(defendingArmy) * DEFENDERS_MODIFIER_BONUS)) {
			return true;
		} else {
			return false;
		}
	}

	private int calculateArmyAttackingStrength(Army army) {
		int strength = 0;
		for (Soldier soldier : army.getSoldiers()) {
			strength += soldier.getAttackingStrength();
		}
		return strength;
	}

	private int calculateArmyDefendingStrength(Army army) {
		int strength = 0;
		for (Soldier soldier : army.getSoldiers()) {
			strength += soldier.getDefendingStrength();
		}
		return strength;
	}
}
