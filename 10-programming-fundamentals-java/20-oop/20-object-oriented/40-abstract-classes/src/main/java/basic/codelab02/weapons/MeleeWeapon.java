package basic.codelab02.weapons;

import basic.codelab02.Enemy;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon() {
        super(8);
    }

    @Override
    public void dealDamageToEnemy(Enemy enemy) {
        enemy.getStabbed(getDamage());
    }
}
