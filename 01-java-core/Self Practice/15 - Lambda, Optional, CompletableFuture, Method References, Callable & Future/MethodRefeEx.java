// Use method reference to an instance method of a particular object

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MethodRefeEx
{
    // A Utility class with an instance method
    static class Printer
    {
        public void printUpperCase(String str)
        {
            System.out.println(str.toUpperCase());
        }
    }

    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("java", "CompletableFuture", "Method", "Reference");

        // Create a particular instance of Printer
        Printer printer = new Printer();

        // Use method reference to call printUpperCase on each element
        words.forEach(printer::printUpperCase); // equivalent to: word -> printer.printUpperCase(word)
    }
}
