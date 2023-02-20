package basic.codelab03;

public class KindMonster extends Monster {
    public KindMonster() {
        super(1);
    }

    @Override
    public void attack(Monster monster) {
        if (this.isAlive()) {
            monster.heal(getAttack());
        }

    }
}
