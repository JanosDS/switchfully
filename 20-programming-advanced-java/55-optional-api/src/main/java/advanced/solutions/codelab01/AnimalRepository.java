package advanced.solutions.codelab01;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class AnimalRepository {

    private Map<String, Animal> userMap = ImmutableMap.<String, Animal>builder()
            .put("Dog", new Animal("Dog", null, Habitat.HOUSE))
            .put("Deer", new Animal("Deer", AnimalType.HERBIVORE, Habitat.FOREST))
            .put("Hedgehog", new Animal("Hedgehog", AnimalType.HERBIVORE, null))
            .put("Camel", new Animal("Camel", AnimalType.HERBIVORE, Habitat.DESERT))
            .put("Shark", new Animal("Shark", AnimalType.CARNIVORE, Habitat.SEA))
            .build();


    /**
     * Refactor the following code so that it returns an optional
     */
    public Optional<Animal> getAnimalByName(String name) {
        return Optional.ofNullable(userMap.get(name));
    }
}
