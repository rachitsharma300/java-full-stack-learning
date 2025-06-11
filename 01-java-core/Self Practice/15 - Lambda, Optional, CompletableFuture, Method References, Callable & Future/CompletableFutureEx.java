// Create a CompletableFuture to run a task asynchronously and print result

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx
{
    public static void main(String[] args)
    {
        // Create a CompletableFuture to run a task asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
           // Simulate time-consuming task
           try
           {
               Thread.sleep(2000); // 2 second delay
           }
           catch (InterruptedException e)
           {
               e.printStackTrace();
           }
           return "Task Completed !";
        });

       //  Print result safely
        try
        {
            String result = future.get(); // Block until complete
            System.out.println("Result; " + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        // Attach a callback to print result once task is done
        future.thenAccept(result -> System.out.println("Result: " + result));

        // Optional: Do other tasks here while waiting..

        // Block main thread just to see output ( not recommended in production )
        future.join();
    }
}
