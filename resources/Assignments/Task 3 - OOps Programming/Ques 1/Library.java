// Class to represent a Library that holds books and allows managing them
class Library
{
    private Book[] books;
    private int count;

    // Initialize the library with space for 5 books
    public Library()
    {
        books = new Book[5];
        count = 0;
    }

    // Method to add a new book
    public void addBook(Book book)
    {
        if (count < books.length)
        {
            books[count++] = book;
            System.out.println(" Book added successfully.\n");
        }
        else
        {
            System.out.println(" Library is full. Cannot add more books.\n");
        }
    }

    // Method to replace the book info by bookID
    public void replaceBook(int bookID, String newTitle, String newAuthor)
    {
        for (int i = 0; i < count; i++)
        {
            if (books[i].getBookID() == bookID)
            {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                System.out.println(" Book replaced successfully.\n");
                return;
            }
        }
        System.out.println(" Book ID not found.\n");
    }

    // Display all books in the library
    public void displayBooks()
    {
        if (count == 0)
        {
            System.out.println(" No books in the library yet.\n");
            return;
        }

        System.out.println("\nLibrary Collection:");
        System.out.println("-------------------------");
        for (int i = 0; i < count; i++)
        {
            books[i].displayInfo();
        }
    }
}
