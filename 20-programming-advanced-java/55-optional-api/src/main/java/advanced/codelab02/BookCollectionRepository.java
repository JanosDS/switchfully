package advanced.codelab02;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class BookCollectionRepository {

    private Map<Author, BookCollection> map = ImmutableMap.<Author, BookCollection>builder()
            .put(new Author("George", "Martin"), new BookCollection("A Game of Thrones", "A Clash of Kings", "A Storm of Swords"))
            .put(new Author("Patrick", "Rothfuss"), new BookCollection("The name of the Wind", "The Wise Man's Fear"))
            .put(new Author("Stephen", "King"), new BookCollection("Carrie", "The Shining", "The Dark Tower: The Gunslinger", "It"))
            .put(new Author("Brandon", "Sanderson"), new BookCollection("Elantris", "The Final Empire", "The Well of Ascension", "The hero of Ages"))
            .build();

    public Optional<BookCollection> findCollectionByAuthor(Author author) {
        throw new RuntimeException("Implement me!");
    }

}
