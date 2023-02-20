package basic.codelab02.weapons;

import basic.codelab02.Enemy;

public abstract class Weapon {
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void dealDamageToEnemy(Enemy enemy);
}
