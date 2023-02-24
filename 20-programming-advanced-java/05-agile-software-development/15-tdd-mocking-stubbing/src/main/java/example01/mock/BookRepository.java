package example01.mock;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        throw new RuntimeException("Not yet implemented");
    }
}
