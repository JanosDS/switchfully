package basic.solutions.codelab03;

public class KindMonster extends Monster {

    public KindMonster() {
        super(1);
    }

    @Override
    public void fight(Monster monster) {
        if (isAlive()) {
            monster.addHealth(getAttackPower());
        }
    }
}
