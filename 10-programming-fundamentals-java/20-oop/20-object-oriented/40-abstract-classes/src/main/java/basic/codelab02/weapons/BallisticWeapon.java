package basic.codelab02.weapons;

import basic.codelab02.Enemy;

public class BallisticWeapon extends Weapon {
    public BallisticWeapon() {
        super(10);
    }

    @Override
    public void dealDamageToEnemy(Enemy enemy) {
        enemy.getShot(getDamage());
    }
}
