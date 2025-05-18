/*
Task Descriptions :
1. Design a java program that uses OOP principle to model the Book.
Create two classes: Book and Library. The Book class should have attributes such
as bookID, title,author, and isAvailable. The Library class should include
an array to store book objects.

2Provide methods to add books, remove book search books(using id) and display books.
Write a java program that demonstrates the use of these classes and methods by allowing
the user to interact with the library system.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
class Book {                                           | class Library {                                               | public class BookManagementSystem {          |
// attributes                                          |private Book[] books;                                          | public static void main(String[] args) {     |
// Constructors to initialize book attributes.         |                                                               | Library library = new Library();             |
// Getter and setter methods for book attributes.      |public Library() {                                             | // Implement a menu- driven user interface to|
                                                       |this.books = new Book[5];                                      | interact with the library system             |
                                                       |  }                                                            | Allow users to add, replace and display books|
                                                       | Methods to add a book to the Library                          | }                                           |
                                                       | public void addBook(Book book) {                              | }                                              |
                                                       | // Add the book to the books Array                                                                           |
                                                       | }                                                                                                            |
                                                       | Method to replace a book from the library                                                                    |
                                                       | public void replaceBook(int bookID) {                                                                        |
                                                       | // replace the book name and author of the given bookID                                                      |
                                                       | from the books                                                                                               |
                                                       | }                                                                                                            |
                                                       | // Methods to display all books in the library                                                               |
                                                       | public void displayBooks() {                                                                                 |
                                                       | } }                                                                                                          |
----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/
import java.util.Scanner;

// Main class to interact with the Library system
public class BookManagementSystem
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            // Menu
            System.out.println("====== Library Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. Replace Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    // Add new book
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume leftover newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(id, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    // Replace book details
                    System.out.print("Enter Book ID to replace: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume leftover newline
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    library.replaceBook(bookID, newTitle, newAuthor);
                    break;

                case 3:
                    // Show all books
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("👋 Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice. Try again.\n");
            }
        }
        while (choice != 4);

        scanner.close();
    }
}
/*
----------------------------------------|
        OUTPUT                          |
----------------------------------------|
Library Menu                            |
1. Add Book                             |
2. Replace Book                         |
3. Display Books                        |
4. Exit                                 |
        Enter your choice: 1            |
        Enter Book ID: 101              |
        Enter Title: Java Programming   |
        Enter Author: John Doe          |
Book added successfully.                |
                                        |
Library Menu                            |
1. Add Book                             |
2. Replace Book                         |
3. Display Books                        |
4. Exit                                 |
        Enter your choice: 3            |
                                        |
        Library Collection:             |
        -------------------------       |
        Book ID    : 101                |
        Title      : Java Programming   |
        Author     : John Doe           |
        Available  : Yes                |
----------------------------------------|
*/