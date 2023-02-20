package basic.codelab02;

import basic.codelab02.weapons.Weapon;

public class Enemy {
    private Weapon weapon;

    private int health = 100;

    private String name;

    public Enemy(Weapon weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    public void getShot(int dmg) {
        this.health -= dmg;
    }

    public void getStunned(int dmg) {
        this.health -= dmg;
    }

    public void getStabbed(int dmg) {
        this.health -= dmg;
    }
}
