package basic.codelab03;

public class Monster {
    private int health = 10;
    private int attack;

    public Monster(int attack) {
        this.attack = attack;
    }

    public boolean isAlive() {
        if (health == 0) {
            return false;
        }
        return true;
    }

    public int getAttack() {
        return attack;
    }

    public void heal(int healing) {
        health += healing;
    }

    public void attack(Monster monster) {
        if (this.isAlive() && monster.isAlive()) {
            monster.takeDamage(this.attack);
        }
    }

    public void takeDamage(int dmg) {
        if (health > dmg) {
            health -= dmg;
        }
        health = 0;
    }
}
