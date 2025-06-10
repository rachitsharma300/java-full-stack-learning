// Explain start() vs run() methods in Thread

public class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Running in thread:" + Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        MyThread t1 = new MyThread();

        // Call start() - multithreading
        t1.start();

        // Calls run() directly - no multithreading
        t1.run();
    }
}
