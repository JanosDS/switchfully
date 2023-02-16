package advanced.codelab01;

public class GoatApplication {
    public static void main(String[] args) {
        Goat geit = new Goat(5, Health.GOATERRILE);
        MountainGoat mGeit = new MountainGoat(4, Health.GOATKAY);
        System.out.println(geit.toString());
        System.out.println(mGeit.toString());
        System.out.println(mGeit.climb());
    }
}
