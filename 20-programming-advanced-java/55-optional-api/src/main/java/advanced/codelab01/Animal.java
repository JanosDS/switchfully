package advanced.codelab01;

/**
 * You don't need to make any changes to this class
 */
public class Animal {
    private final String name;
    private final AnimalType animalType;
    private final Habitat habitat;

    public Animal(String name, AnimalType animalType, Habitat habitat) {
        this.name = name;
        this.animalType = animalType;
        this.habitat = habitat;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalType=" + animalType +
                ", habitat=" + habitat +
                '}';
    }
}
