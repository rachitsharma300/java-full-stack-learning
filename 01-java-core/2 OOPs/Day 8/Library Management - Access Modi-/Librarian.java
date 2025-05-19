/*
🧩 Assignment 1: Library Management - Access Modifiers
🔹 Objective:
Understand the usage of public, private, protected, and default access modifiers in real-world scenarios.
📝 Task:
Create a Book class with the following:
•	title, author (private)
•	id (protected)
•	genre (default)
•	getBookInfo() method (public) to display book details.
Create another class Librarian that accesses book information.
✅ Expected Output:
Title: Clean Code
Author: Robert C. Martin
ID: 102
Genre: Programming
💡 Concepts:
•	Use private to encapsulate fields.
•	Use protected/default to test access from another class in the same package.
•	Create getter/setter to access private members.
 */
public class Librarian
{
    public static void main(String[] args)
    {
        // Create Book obj
        Book book = new Book("Clean Code", "Robert C. Martin", 102, "Programming");

        //Access public method to display book info-
        book.getBookInfo();

        //Access protected & default members (same package, so accessible)
/*
        System.out.println("ID :" + book.id); // Access protected field
          System.out.println("Genre :" + book.genre); // Access default field

 */
    }
}
