package advanced.codelab02;

import com.google.common.collect.Lists;

import java.util.List;

public class BookCollection {

    private final List<String> bookList;

    public BookCollection(String... books) {
        this.bookList = Lists.newArrayList(books);
    }

    public String getAsString() {
        return bookList.toString();
    }
}
