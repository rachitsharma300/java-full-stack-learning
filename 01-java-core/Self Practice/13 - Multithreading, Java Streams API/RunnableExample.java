// Implement Runnable interface and print thread name 3 times

// This class Implements Runnable to define thread behaviour
public class RunnableExample implements Runnable
{
    // The run() method contains the code to be executed by the thread
    @Override
    public void run()
    {
        for (int i =1; i <= 3; i++)
        {
            System.out.println("Runnable: " + Thread.currentThread().getName());

            // Adding slight delay to simulate real thread execution
            try
            {
                Thread.sleep(400);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread was Interrupted");
            }
        }
    }

    // Main method to start the thread
    public static void main(String[] args)
    {
        // Create method to start the thread
        RunnableExample runnableTask = new RunnableExample();

        // Create a Thread with the Runnable Object
        Thread thread = new Thread(runnableTask,"MyRunnableThread");

        // Start the thread
        thread.start();
    }
}
