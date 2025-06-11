// Write a program to chain multiple CompletableFuture tasks

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChaining
{
    public static void main(String[] args)
    {
        //Start an async task that supplies a number
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Step 1: Supplying Number 5");
            return 5;
        });

        // Multiply the number by 2
        CompletableFuture<Integer> multiplies = future.thenApply(num -> {
            System.out.println("Step 2: Multiply by 2");
            return num * 2;
        });

        // Convert the number to a string
        CompletableFuture<String> converted = multiplies.thenApply(num -> {
            System.out.println("Convert to string");
            return "Result is: " + num;
        });

        // Print the final result
        converted.thenAccept(result ->{
            System.out.println("Step 4: Final Output");
            System.out.println(result);
        });

        // Wait for all tasks to complete
        converted.join();
    }
}
