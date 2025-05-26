import java.util.Objects;

public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private String isbn;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
    }

    // Getters
    public String getTitle()
    { return title; }
    public String getAuthor()
    { return author; }
    public String getIsbn()
    { return isbn; }
    public int getYearPublished()
    { return yearPublished; }

    // Equals and hashCode for HashSet (based on ISBN)
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(isbn);
    }

    // Comparable for TreeSet (sort by yearPublished)
    @Override
    public int compareTo(Book other)
    {
        return Integer.compare(this.yearPublished, other.yearPublished);
    }

    @Override
    public String toString()
    {
        return title + ", " + author + ", " + yearPublished;
    }
}
