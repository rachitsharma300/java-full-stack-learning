// Use Optional to avoid NullPointerException on a possibly null string

import java.util.Optional;

public class OptionalNullCheckExample
{
    public static void main(String[] args)
    {
        String input = getNullableString();  // Could return null

        // Wrap string in Optional
        Optional<String> optionalValue = Optional.ofNullable(input);

        // Safely handle the value
        optionalValue.ifPresentOrElse(
                value -> System.out.println("Value: " + value),
                () -> System.out.println("Value is null")
        );
    }

    // Simulates a method that return null
    private static String getNullableString()
    {
        return null; // Try changing this to a real string to see the difference
    }
}
