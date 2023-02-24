package advanced.solutions.codelab01;

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
        System.out.println(animalRepository.getAnimalByName(name)
                .map(Animal::toString)
                .orElse("No animal found")
        );
    }

    /**
     * Make sure that the tests for this method are green.
     * Use the map() and orElse() functions.
     */
    public void printOutAnimalType(String name) {
        System.out.println(animalRepository.getAnimalByName(name)
                .map(Animal::getAnimalType)
                .map(Enum::toString)
                .orElse("No animal type found")
        );
    }

    /**
     * Make sure that the tests for this method are green.
     * Use the map() and orElse() functions.
     */
    public void printOutAnimalHabitatTemperature(String name) {
        System.out.println(animalRepository.getAnimalByName(name)
                .map(Animal::getHabitat)
                .map(Habitat::getAverageTemperature)
                .map(Object::toString)
                .orElse("No temperature found")
        );
    }
}
