package basic.codelab03;

public class Main {
    public static void main(String[] args) {
        KindMonster kMon = new KindMonster();
        ScaryMonster sMon = new ScaryMonster(5);
        GiantMonster gMon = new GiantMonster();

        kMon.attack(sMon);
    }
}
