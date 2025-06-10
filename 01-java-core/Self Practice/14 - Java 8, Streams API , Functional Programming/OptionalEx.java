// Explain Optional class and write code to check if a value is present.

import java.util.Optional;

public class OptionalEx
{
    public static void main(String[] args)
    {
        // Optional with non-null value
        Optional<String> name = Optional.of("Parsuram");

        // Check if value is present
        if (name.isPresent())
        {
            System.out.println("Value is Present: " + name.get());
        }
        else
        {
            System.out.println("Value is not present.");
        }
        // Optional with null (use ofNullable to avoid NullPointerException)
        Optional<String> emptyName = Optional.ofNullable(null);

        // Using ifPresent (Functional Style)
        emptyName.ifPresent(val -> System.out.println("Value: " + val));
    }
}
