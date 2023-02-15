package basic.codelab03;

import basic.codelab03.personel.*;
import basic.codelab03.villa.*;
import org.checkerframework.checker.units.qual.K;

public class Main {

    /**
     * This application for tending to a fancy villa is a mess.
     * All classes are in a big pile.
     * Encapsulation is non-existent.
     * <p>
     * Let's clean it up:
     * 1. Separate the classes into different packages
     * 2. Encapsulate as much as possible (private if possible, then package private, then protected, if nothing else goes finally public)
     * <p>
     * Bonus (advanced) exercise:
     * The gardener became sick suddenly, but the garden needs urgent tending.
     * Luckily the butler has some gardening skills.
     * How hard would it be to let the butler tend to the gardens?
     * <p>
     * Try to refactor the code in such a way that you don't have any getters or setters.
     * Using too many getters or setters is a sign of feature envy/message chain (code smells).
     * See: https://refactoring.guru/refactoring/smells/couplers for more information.
     * <p>
     * What would be the benefit in writing your codebase without any getters or setters?
     * <p>
     * After this change how hard is it make the gardener once again responsible for the garden?
     * <p>
     * This would be quite easy to solve using subclasses, where the staff class contains all the tasks that need to be done (methods)
     * And the staff members can utilise these
     */
    public static void main(String[] args) {
        House house = new House(
                new Bathroom(),
                new Kitchen(),
                new Diningroom(),
                new Garden(),
                new Staff(
                        new Gardener("Patrick"),
                        new Butler("Sofia"),
                        new Cook("Hendrick"),
                        new Plumber("Alexia")
                )
        );
        house.tendToGarden();
        System.out.println("********************");
        house.serveFood();
        System.out.println("********************");
        house.fixBathroom();
    }
}
