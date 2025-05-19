public class Book
{
    // Private Fields
    private String title;
    private String author;

    // Protected Fields
    protected int id;

    // Default (package-private) field
    String genre;

    //Constructor to init the fields
    public Book(String title, String author, int id, String genre)
    {
        this.title = title;
        this.author = author;
        this.id = id;
        this.genre = genre;
    }
    // Public method to display book details
    public void getBookInfo()
    {
        System.out.println("Title :" + title);
        System.out.println("Author :" + author);
        System.out.println("ID :" + id);
        System.out.println("Genre :" + genre);
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
}
