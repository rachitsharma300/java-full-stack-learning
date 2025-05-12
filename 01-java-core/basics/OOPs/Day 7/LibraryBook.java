/*
Library System
🔹 Objective:
Use class, constructors, and all types of methods.
🔹 Requirements:
•	Create class LibraryBook.
•	Instance variables: title, author, isAvailable.
•	Static variable: libraryName.
•	No-arg constructor: sets book as available.
•	Parameterized constructor: sets title and author.
•	Method borrowBook() sets availability to false.
•	Method returnBook() sets availability to true.
•	Method checkAvailability() returns boolean.
🔹 Input:
LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho");
book1.borrowBook();
System.out.println("Available: " + book1.checkAvailability());
book1.returnBook();
System.out.println("Available: " + book1.checkAvailability());
🔹 Output:
Available: false
Available: true
 */
class LibraryBook
{
    String title;
    String author;
    boolean isAvailable;

    static String libraryName = "Natioanl Libray";

    LibraryBook() {
        isAvailable = true;
    }

    LibraryBook(String title, String author)
    {
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    void borrowBook()
    {
        isAvailable = false;
    }
    void returnBook()
    {
        isAvailable = true;
    }
    boolean checkAvailability()
    {
        return isAvailable;
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho");

        book1.borrowBook();
        System.out.println("Available :" + book1.checkAvailability());

        book1.returnBook();
        System.out.println("Available :" + book1.checkAvailability());
    }
}
