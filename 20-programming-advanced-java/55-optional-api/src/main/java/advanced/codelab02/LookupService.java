package advanced.codelab02;

public class LookupService {

    private AuthorRepository authorRepository;
    private BookCollectionRepository bookCollectionRepository;

    public LookupService(AuthorRepository authorRepository, BookCollectionRepository bookCollectionRepository) {
        this.authorRepository = authorRepository;
        this.bookCollectionRepository = bookCollectionRepository;
    }

    /**
     * Implement this method so that it will return the book collection as string for the given first name of the author
     * If that doesn't work try to do the same with the last name of the author
     * If that doesn't work return "No book collection found"
     *
     */
    public String getBookCollectionByAuthorName(String firstName, String lastName){
        return null;
    }
}
