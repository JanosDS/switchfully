package basic.codelab01;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Read the README.md file.
 */
public class SoundService {

    private static ArrayList<SoundPanel> soundPanels = new ArrayList<>();

    public static void main(String[] args) {
        Baby[] babies = {new Baby(), new Baby()};
        Computer[] computers = {new Computer()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        Cat[] cats = {new Cat()};
        Piano[] pianos = {new Piano(), new Piano()};

        addToPanel(babies);
        addToPanel(computers);
        addToPanel(dogs);
        addToPanel(cats);
        addToPanel(pianos);
        for (SoundPanel panel : soundPanels) {
            System.out.println(panel.makeSound());
        }

    }

    public static void addToPanel(SoundPanel[] toAdd) {
        for (SoundPanel panel : toAdd) {
            soundPanels.add(panel);
        }
    }

    public static String allMakeSound(SoundPanel[] panels) {
        String str = "";
        for (SoundPanel panel : panels) {
            str += panel.makeSound();
        }
        return str;
    }
}
