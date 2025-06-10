// Write a parallel stream example and explain its use


import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        // Using parallelStream() to calculate squares in parallel
        numbers.parallelStream()
                .map(n -> {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " processing " + n);
                    return n * n;
                })
                .forEach(System.out::println);
    }
}
