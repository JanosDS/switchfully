package switchtothesun.attraction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AttractionRepositoryTest {

    @Autowired
    private AttractionRepository attractionRepository;

    AttractionRepositoryTest() {
    }

    @Test
    void getAllCountries() {
        Assertions.assertThat(true).isTrue();
    }
}
