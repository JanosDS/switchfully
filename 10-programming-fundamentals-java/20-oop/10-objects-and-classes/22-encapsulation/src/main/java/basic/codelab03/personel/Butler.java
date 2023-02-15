package basic.codelab03.personel;

import basic.codelab03.food.Food;
import basic.codelab03.villa.Diningroom;
import basic.codelab03.villa.Garden;

public class Butler {

    private final String name;

    public Butler(String name) {
        this.name = name;
    }

    public void serveFood(Food food, Diningroom diningroom) {
        System.out.println("Butler " + name + " is serving " + food.getName() + " in the dining room");
        diningroom.serveFood(food);
    }

    public void tendTo(Garden garden) {
        System.out.println("Gardener " + name + " will (try his best to) tend to the garden.");
        garden.removeWeeds();
        garden.trimHedge();
        garden.mowGrass();
    }
}
