package basic.codelab03.personel;

import basic.codelab03.villa.Bathroom;

public class Plumber {

    private final String name;

    public Plumber(String name) {
        this.name = name;
    }

    public void fixBathroom(Bathroom bathroom) {
        System.out.println("Plumber " + name + " is fixing the bathroom");
        bathroom.fixLeak();
    }
}
