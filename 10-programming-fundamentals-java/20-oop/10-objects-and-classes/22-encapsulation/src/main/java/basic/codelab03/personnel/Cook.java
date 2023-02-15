package basic.codelab03.personnel;

import basic.codelab03.food.Food;
import basic.codelab03.villa.Kitchen;

public class Cook {

    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    public Food prepareFood(Kitchen kitchen) {
        System.out.println("Cook " + name + " is preparing some tasty chicken");
        return kitchen.prepareFood("Tasty chicken");
    }
}
