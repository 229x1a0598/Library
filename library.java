import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library which holds a collection of books.
 */
public class Library {
    private List<Book> books;

    /**
     * Constructs a new Library object.
     */
    public Library() {
        books = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book from the library by its title.
     *
     * @param title The title of the book to remove.
     * @return true if the book was found and removed, false otherwise.
     */
    public boolean removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    /**
     * Searches for a book by its title.
     *
     * @param title The title of the book to search for.
     * @return The book if found, null otherwise.
     */
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Lists all the books in the library.
     *
     * @return A list of all books.
     */
    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }
}
