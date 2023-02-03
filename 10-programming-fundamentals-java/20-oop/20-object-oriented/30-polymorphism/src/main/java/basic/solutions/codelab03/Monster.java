package basic.solutions.codelab03;

public class Monster {
    private int health = 10;
    private final int attackPower;

    public Monster(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHealth() {
        return health;
    }

    protected void addHealth(int healthAmount) {
        health += healthAmount;
    }

    public void takeDamage(int damageAmount) {
        health = Math.max(0, health - damageAmount);
    }

    public void fight(Monster monster) {
        if (isAlive() && this != monster) {
            monster.takeDamage(getAttackPower());
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

}
