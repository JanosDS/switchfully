package advanced.solutions.codelab02;

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
        return Optional.ofNullable(map.get(name));
    }

    public Optional<Author> findAuthorByLastName(String lastName) {
        return map.values().stream().filter(author -> author.getLastName().equals(lastName)).findFirst();
    }
}
