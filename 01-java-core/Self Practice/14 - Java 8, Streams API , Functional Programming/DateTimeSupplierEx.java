// Demonstrate a Supplier functional interface that returns current date/time

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DateTimeSupplierEx
{
    public static void main(String[] args)
    {
        // Supplier to provide current date and time
        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now();

        // Using the supplier
        LocalDateTime current = dateTimeSupplier.get();
        System.out.println("Current date and time: " + current);
    }
}
