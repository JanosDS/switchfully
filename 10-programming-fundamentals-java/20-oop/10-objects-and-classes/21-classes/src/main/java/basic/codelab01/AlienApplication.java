package basic.codelab01;

public class AlienApplication {
    public static void main(String[] args) {
        Alien zappyTheAlien = new Alien();
        Alien blyubTheAlien = new Alien("Blyub", "Wilziax");
        Alien kujluTheAlien = new Alien("Kujlu", "Krak", 3);

        System.out.println(zappyTheAlien.getFullName());
        System.out.println(blyubTheAlien.getFullName());
        System.out.println(kujluTheAlien.getFullName());
        System.out.println(kujluTheAlien.getFirstName() + " has " + kujluTheAlien.getNumberOfHeads() + " heads.");
    }
}
