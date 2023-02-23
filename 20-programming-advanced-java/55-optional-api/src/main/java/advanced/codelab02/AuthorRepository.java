package advanced.codelab02;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class AuthorRepository {

    private Map<String, Author> map = ImmutableMap.<String, Author>builder()
            .put("George", new Author("George", "Martin"))
            .put("Patrick", new Author("Patrick", "Rothfuss"))
            .put("Stephen", new Author("Stephen", "King"))
            .put("Brandon", new Author("Brandon", "Sanderson"))
            .put("Tim", new Author("Tim", "Vercruysse"))
            .build();

    public Optional<Author> findAuthorByFirstName(String name) {
        throw new RuntimeException("Implement me!");
    }

    public Optional<Author> findAuthorByLastName(String lastName) {
        throw new RuntimeException("Implement me!");
    }
}
