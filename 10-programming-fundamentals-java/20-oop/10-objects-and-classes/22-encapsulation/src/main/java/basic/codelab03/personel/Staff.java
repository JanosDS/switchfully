package basic.codelab03.personel;

import basic.codelab03.villa.Diningroom;
import basic.codelab03.villa.Garden;
import basic.codelab03.villa.Kitchen;
import basic.codelab03.villa.Bathroom;

public class Staff {

    private final Gardener gardener;
    private final Butler butler;
    private final Cook cook;
    private final Plumber plumber;

    public Staff(Gardener gardener, Butler butler, Cook cook, Plumber plumber) {
        this.gardener = gardener;
        this.butler = butler;
        this.cook = cook;
        this.plumber = plumber;
    }

    public void tendToGarden(Garden garden) {
        gardener.tendTo(garden);
    }

    public void serveFood(Kitchen kitchen, Diningroom diningroom) {
        butler.serveFood(cook.prepareFood(kitchen), diningroom);
    }

    public void fixBathroom(Bathroom bathroom) {
        plumber.fixBathroom(bathroom);
    }
}
