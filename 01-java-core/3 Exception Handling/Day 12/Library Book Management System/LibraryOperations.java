import java.util.List;

public interface LibraryOperations
{
    void addBook(Book book);
    void removeBook(String isbn);
    List<Book> searchBookByTitle(String title);
    List<Book> searchBookByAuthor(String author);
    void displayAllBooks();
}
