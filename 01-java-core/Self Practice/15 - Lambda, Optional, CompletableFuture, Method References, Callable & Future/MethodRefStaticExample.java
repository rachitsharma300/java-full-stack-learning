// Explain method reference for a static method and write code example

import java.util.Arrays;
import java.util.List;

public class MethodRefStaticExample
{
    // Static method to convert string to upper case
    public static String convertToUpperCase(String s)
    {
        return s.toUpperCase();
    }

    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Rachit", "Mausam", "Parsuram");

        // Using method reference to a static method
        names.stream()
                .map(MethodRefStaticExample::convertToUpperCase)
                .forEach(System.out::println);
    }
}
