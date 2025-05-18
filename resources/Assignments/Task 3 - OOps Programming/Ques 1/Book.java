// Class to model a Book with basic information
class Book
{
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor to initialize book details
    public Book(int bookID, String title, String author)
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, book is available
    }

    // Getters auto Generate through Intelli Idea
    public int getBookID()
    {
        return bookID;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    // Setters auto Generate through Intelli Idea
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setAvailable(boolean available)
    {
        isAvailable = available;
    }

    // Display book details
    public void displayInfo()
    {
        System.out.println("Book ID    : " + bookID);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Available  : " + (isAvailable ? "Yes" : "No"));
        System.out.println("----------------------------------");
    }
}
