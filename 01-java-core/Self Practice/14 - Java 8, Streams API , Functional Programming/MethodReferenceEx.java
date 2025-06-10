// Use method reference to print a list of names

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Ram", "Sita", "Shyam", "Geeta");

        // Using method reference instead of lambda
        names.forEach(System.out::println);
    }
}
