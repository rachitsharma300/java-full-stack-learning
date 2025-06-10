// What is a deadlock? Write code example causing deadlock.

class SharedResource
{
    void methodA(SharedResource resourceB)
    {
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName() + "locked Resource A");

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            synchronized (resourceB)
            {
                System.out.println(Thread.currentThread().getName() + " locked Resource B ");
            }
        }
    }

    void methodB(SharedResource resourceA)
    {
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName() + " locked Resource B");

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            synchronized (resourceA)
            {
                System.out.println(Thread.currentThread().getName() + " locked Resource A");
            }
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        SharedResource resourceA = new SharedResource();
        SharedResource resourceB = new SharedResource();

        Thread t1 = new Thread(() -> resourceA.methodA(resourceB), "Thread-1");
        Thread t2 = new Thread(() -> resourceB.methodA(resourceA), "Thread-2");

        t1.start();
        t2.start();
    }
}