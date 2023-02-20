package basic.codelab02.weapons;

import basic.codelab02.Enemy;

public class EnergyWeapon extends Weapon {
    public EnergyWeapon() {
        super(20);
    }

    @Override
    public void dealDamageToEnemy(Enemy enemy) {
        enemy.getStunned(getDamage());
    }
}
