package basic.codelab03.soldier;

public class Soldier {
	private Weapon weapon;
	private boolean isSpecialised;

	public Soldier() {
		weapon = Weapon.BARE_FISTS;
		isSpecialised = false;
	}

	public void specialiseSoldier() {
		this.isSpecialised = true;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public boolean isSpecialised() {
		return this.isSpecialised;
	}

	public void equipWeapon(Weapon newWeapon) {
		if (canSoldierEquipWeapon(newWeapon)) {
			this.weapon = newWeapon;
		}
	}

	public boolean canSoldierEquipWeapon(Weapon weapon) {
		if (!weapon.isSpecial()) {
			return true;
		}
		if (weapon.isSpecial() && isSpecialised) {
			return true;
		}
		return false;
	}


	public Soldier fight(Soldier enemy) {
		if (weapon.getDamage() >= enemy.getWeapon().getDamage()) {
			return this;
		}
		return enemy;
	}
}
