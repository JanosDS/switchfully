package advanced.codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LookupServiceTest {

    private LookupService lookupService;

    @BeforeEach
    void setUp() {
        lookupService = new LookupService(new AuthorRepository(), new BookCollectionRepository());
    }

    @Test
    void findByFirstName() {
        String bookCollection = lookupService.getBookCollectionByAuthorName("Stephen", "King");

        Assertions.assertThat(bookCollection).isEqualTo("[Carrie, The Shining, The Dark Tower: The Gunslinger, It]");
    }

    @Test
    void findByLastName() {
        String bookCollection = lookupService.getBookCollectionByAuthorName("Bardon", "Sanderson");

        Assertions.assertThat(bookCollection).isEqualTo("[Elantris, The Final Empire, The Well of Ascension, The hero of Ages]");
    }

    @Test
    void bookCollectionNotFound() {
        String bookCollection = lookupService.getBookCollectionByAuthorName("Tim", "Vercruysse");

        Assertions.assertThat(bookCollection).isEqualTo("No book collection found");
    }

    @Test
    void authorNotFound() {
        String bookCollection = lookupService.getBookCollectionByAuthorName("David", "Guetta");

        Assertions.assertThat(bookCollection).isEqualTo("No book collection found");
    }
}
