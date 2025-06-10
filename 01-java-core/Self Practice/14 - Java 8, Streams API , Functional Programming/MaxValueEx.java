// Write a stream to find the maximum value from a list of integers

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValueEx
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10, 45, 32, 67, 89, 24);

        Optional<Integer> maxValue = numbers.stream()
                .max(Integer::compareTo);

        maxValue.ifPresent(max -> System.out.println("Max value: " + max));
    }
}
