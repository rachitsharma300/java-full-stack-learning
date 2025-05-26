import java.util.*;

public class LibrarySystem implements LibraryOperations
{
    private Set<Book> bookSet = new HashSet<>();
    private Map<String, List<Book>> titleMap = new HashMap<>();
    private Map<String, List<Book>> authorMap = new HashMap<>();
    private Set<Book> sortedBooks = new TreeSet<>();

    @Override
    public void addBook(Book book)
    {
        if (bookSet.add(book))
        {
            // Add to titleMap
            titleMap.computeIfAbsent(book.getTitle(), k -> new ArrayList<>()).add(book);
            // Add to authorMap
            authorMap.computeIfAbsent(book.getAuthor(), k -> new ArrayList<>()).add(book);
            // Add to TreeSet
            sortedBooks.add(book);
            System.out.println("Book added: " + book.getTitle());
        }
        else
        {
            System.out.println("Book already exists with ISBN: " + book.getIsbn());
        }
    }

    @Override
    public void removeBook(String isbn)
    {
        Book toRemove = null;
        for (Book b : bookSet)
        {
            if (b.getIsbn().equals(isbn))
            {
                toRemove = b;
                break;
            }
        }

        if (toRemove != null)
        {
            bookSet.remove(toRemove);
            sortedBooks.remove(toRemove);

            titleMap.get(toRemove.getTitle()).remove(toRemove);
            if (titleMap.get(toRemove.getTitle()).isEmpty())
            {
                titleMap.remove(toRemove.getTitle());
            }

            authorMap.get(toRemove.getAuthor()).remove(toRemove);
            if (authorMap.get(toRemove.getAuthor()).isEmpty())
            {
                authorMap.remove(toRemove.getAuthor());
            }

            System.out.println("Book removed: " + toRemove.getTitle());
        }
        else
        {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    @Override
    public List<Book> searchBookByTitle(String title)
    {
        List<Book> result = titleMap.getOrDefault(title, new ArrayList<>());
        System.out.println("Search result for title '" + title + "': " + result);
        return result;
    }

    @Override
    public List<Book> searchBookByAuthor(String author)
    {
        List<Book> result = authorMap.getOrDefault(author, new ArrayList<>());
        System.out.println("Search result for author '" + author + "': " + result);
        return result;
    }

    @Override
    public void displayAllBooks()
    {
        System.out.println("All books in the library (sorted by year):");
        for (Book b : sortedBooks)
        {
            System.out.println(b);
        }
    }
}
