import java.util.Vector;

public class VectorThreadSafety
{
    public static void main(String[] args)
    {
        Vector<Integer> sharedVector = new Vector<>();

        // Thread 1: Adds numbers 1 to 5
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i<= 5; i++)
            {
                sharedVector.add(i);
                System.out.println("Thread 1 added: " + i);
            }
        });

        // Thread 2: Adds numbers 6 to 10
        Thread thread2 = new Thread(() -> {
           for (int i = 6; i <= 10; i++)
           {
               sharedVector.add(i);
               System.out.println("Thread 2 Added: " + i);
           }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try
        {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        // Final contents for vector
        System.out.println("\nFinal contents of Vector");
        for (int num : sharedVector)
        {
            System.out.println(num);
        }
    }
}
