// Write a Stream to filter even numbers from a list and print

import java.util.Arrays;
import java.util.List;

public class EvenNumberFilter
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        System.out.println("Even numbers in the list:");
        numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .forEach(System.out::println); // Print each even number
    }
}
