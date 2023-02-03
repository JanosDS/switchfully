package basic.solutions.codelab03;

public class MonsterApp {
    public static void main(String[] args) {
        Monster[] myMonsters = {new KindMonster(), new GiantMonster(), new ScaryMonster(20)};

        System.out.println(myMonsters[2].getHealth());
        System.out.println(myMonsters[2].isAlive());
        System.out.println(myMonsters[1].getAttackPower());
        myMonsters[1].fight(myMonsters[2]);
        System.out.println(myMonsters[2].getHealth());
        System.out.println(myMonsters[2].isAlive());

        myMonsters[0].fight(myMonsters[2]);
        System.out.println(myMonsters[2].getHealth());
        System.out.println(myMonsters[2].isAlive());
    }
}
