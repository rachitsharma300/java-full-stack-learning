// Write a program that uses Optional.orElse() to provide default value.

import java.util.Optional;

public class OptionalOrElseEx
{
    public static void main(String[] args)
    {
        // A possibly null string ( simulate it with null )
        String name = null;

        // Wrap it in an Optional
        Optional<String> optionalName = Optional.ofNullable(name);

        // Use orElse to provide a default value if name is null
        String finalName = optionalName.orElse("Default Name");

        // Print the result
        System.out.println("Name: " + finalName);
    }
}
