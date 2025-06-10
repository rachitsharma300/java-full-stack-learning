// Explain Function interface and write example to convert string to integer

import java.util.function.Function;

public class StringToIntegerExample
{
    public static void main(String[] args)
    {
        // Function to convert String to Integer
        Function<String, Integer> stringToInteger = str -> Integer.parseInt(str);

        // Applying the function
        Integer result = stringToInteger.apply("12345");

        System.out.println("Converted Integer :" + result);
    }
}
