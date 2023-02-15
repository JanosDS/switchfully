package basic.codelab03.personel;

import basic.codelab03.villa.Garden;

public class Gardener {

    private final String name;

    public Gardener(String name) {
        this.name = name;
    }

    public void tendTo(Garden garden) {
        System.out.println("Gardener " + name + " will tend to the garden");
        garden.removeWeeds();
        garden.trimHedge();
        garden.mowGrass();
    }
}
