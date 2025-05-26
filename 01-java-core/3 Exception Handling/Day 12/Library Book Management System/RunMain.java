public class RunMain
{
    public static void main(String[] args)
    {
        LibrarySystem library = new LibrarySystem();

        library.addBook(new Book("The Alchemist", "Paulo Coelho", "123456", 1988));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "654321", 2008));

        library.searchBookByTitle("The Alchemist");
        library.removeBook("123456");

        library.displayAllBooks();
    }
}
