package switchtothesun.attraction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@AutoConfigureTestDatabase
class AttractionRepositoryTest {

    @Autowired
    private AttractionRepository attractionRepository;

    @Test
    void getAllCountries() {
        List<Attraction> allAttractions = attractionRepository.getAllAttractions();
        Assertions.assertThat(allAttractions)
                .extracting(attraction -> attraction.getName())
                .containsExactly("The Eifel Tower", "Côte d'azur", "The Colosseum", "Venice", "Seville");
    }

}
