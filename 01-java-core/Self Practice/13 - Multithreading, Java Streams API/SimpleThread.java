// Write a simple Thread by extending Thread class and print numbers from 1 to 5

public class SimpleThread extends Thread
{
    @Override
    public void run()
    {
        // Task for the thread: print numbers from 1 to 5
        for (int i = 1; i <=5; i++)
        {
            System.out.println("Number: " + i);

            // Sleep for a short time to simulate some dealy (optional)
            try
            {
                Thread.sleep(500);  // 500 milli seconds
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
        }
    }
    public static void main(String[] args)
    {
        // Create an instance of the thread class
        SimpleThread thread = new SimpleThread();

        // Start the thread
        thread.start();
    }
}
