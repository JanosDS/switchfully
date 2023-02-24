package advanced.codelab01;

public class AnimalService {

    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    /**
     * Do the refactoring in AnimalRepository.
     * Afterwards change this code to make it work again.
     */
    public void printOutAnimal(String name) {
        Animal animal = animalRepository.getAnimalByName(name);
        if (animal == null) {
            System.out.println("No animal found");
        } else {
            System.out.println(animal);
        }
    }

    /**
     * Make sure that the tests for this method are green.
     * Use the map() and orElse() functions.
     */
    public void printOutAnimalType(String name) {

    }

    /**
     * Make sure that the tests for this method are green.
     * Use the map() and orElse() functions.
     */
    public void printOutAnimalHabitatTemperature(String name) {

    }
}
