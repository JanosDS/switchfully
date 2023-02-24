package advanced.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@ExtendWith(OutputCaptureExtension.class)
class AnimalServiceTest {

    private AnimalService animalService = new AnimalService(new AnimalRepository());

    @Nested
    class PrintOutAnimal {
        @Test
        void happyPath(CapturedOutput capturedOutput) {
            animalService.printOutAnimal("Dog");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            Animal{name='Dog', animalType=null, habitat=HOUSE}
                            """);
        }

        @Test
        void givenUnknownAnimalThenPrintOutNoAnimalFound(CapturedOutput capturedOutput) {
            animalService.printOutAnimal("Cat");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            No animal found
                            """);
        }
    }

    @Nested
    class PrintOutAnimalType {
        @Test
        void happyPath(CapturedOutput capturedOutput) {
            animalService.printOutAnimalType("Shark");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            CARNIVORE
                            """);
        }

        @Test
        void givenUnknownAnimalThenPrintOutNoAnimalTypeFound(CapturedOutput capturedOutput) {
            animalService.printOutAnimalType("Cat");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            No animal type found
                            """);
        }

        @Test
        void givenAnimalWithoutTypeThenPrintOutNoAnimalTypeFound(CapturedOutput capturedOutput) {
            animalService.printOutAnimalType("Dog");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            No animal type found
                            """);
        }
    }

    @Nested
    class PrintOutAnimalHabitatTemperature {
        @Test
        void happyPath(CapturedOutput capturedOutput) {
            animalService.printOutAnimalHabitatTemperature("Shark");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            20
                            """);
        }

        @Test
        void givenUnknownAnimalThenPrintOutNoAnimalTypeFound(CapturedOutput capturedOutput) {
            animalService.printOutAnimalHabitatTemperature("Cat");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            No temperature found
                            """);
        }

        @Test
        void givenAnimalWithoutTypeThenPrintOutNoAnimalTypeFound(CapturedOutput capturedOutput) {
            animalService.printOutAnimalHabitatTemperature("Hedgehog");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            No temperature found
                            """);
        }

        @Test
        void givenHabitatWithoutTemperatureThenPrintOutNoAnimalTypeFound(CapturedOutput capturedOutput) {
            animalService.printOutAnimalHabitatTemperature("Camel");
            Assertions.assertThat(capturedOutput).isEqualToNormalizingNewlines(
                    """
                            No temperature found
                            """);
        }
    }
}
