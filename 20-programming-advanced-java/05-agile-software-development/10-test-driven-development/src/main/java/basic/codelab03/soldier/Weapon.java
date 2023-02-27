package basic.codelab03.soldier;

public enum Weapon {
	AXE(3, false),
	SWORD(2, false),
	BARE_FISTS(1, false),
	SPEAR(3.5, false),
	FLAMING_SWORD(2 + AXE.getDamage(), true),
	OBSIDIAN_AXE(2 + AXE.getDamage(), true),
	POISONED_SPEAR(3 * SPEAR.getDamage(), true);


	private double damage;
	private boolean isSpecial;

	Weapon(double damage, boolean isSpecial) {
		this.isSpecial = isSpecial;
		this.damage = damage;
	}

	public double getDamage() {
		return damage;
	}

	public boolean isSpecial() {
		return this.isSpecial;
	}
}
