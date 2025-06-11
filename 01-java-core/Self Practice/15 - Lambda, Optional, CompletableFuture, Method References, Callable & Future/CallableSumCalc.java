// Implement Callable to return sum of first N numbers and use Future to get result

import java.util.Iterator;
import java.util.concurrent.*;

public class CallableSumCalc
{
    // Callable task to calculate sun of first N numbers
    static class SumTask implements Callable<Integer>
    {
        private int n;

        public SumTask(int n)
        {
            this.n = n;
        }

        @Override
        public Integer call() throws Exception
        {
            int sum = 0;
            for (int i = 1; i <= n; i++)
            {
                sum += i;
            }
            return sum;
        }
    }

    public static void main(String[] args)
    {
        int n = 100; // change this value as needed

        // Create a thread pool with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit the task
        Future<Integer> future = executor.submit(new SumTask(n));

        try
        {
            // Get the result from future (waits if not done)
            Integer result = future.get();
            System.out.println("Sum of first " + n + " numbers: " + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
