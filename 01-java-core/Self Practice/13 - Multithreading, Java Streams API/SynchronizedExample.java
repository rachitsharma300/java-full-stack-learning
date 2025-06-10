// Write a program to demonstrate thread synchronization using synchronized keyword

class Counter
{
    int count = 0;

    // Synchronized method to prevent race condition
    public synchronized void increment()
    {
        count++;
    }
}

class MyThreads extends Thread
{
    Counter counter;

    MyThreads(Counter counter)
    {
        this.counter = counter;
    }

    public void run()
    {
        for (int i =0; i < 1000; i++)
        {
            counter.increment();
        }
    }
}

public class SynchronizedExample
{
    public static void main(String[] args)
    {
        Counter counter = new Counter();

        MyThreads t1 = new MyThreads(counter);
        MyThreads t2 = new MyThreads(counter);

        t1.start();
        t2.start();

        // Wait for thread to finish
        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Final count: " + counter.count);
    }
}
