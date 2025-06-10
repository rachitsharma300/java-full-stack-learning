// Write a lambda expression to print elements of a list

import java.util.Arrays;
import java.util.List;

public class LambdaPrintEx
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Rachit", "Raushan", "Rohit", "Rahul");

        // Using Lambda expression with forEach
        names.forEach(name -> System.out.println(name));
    }
}
