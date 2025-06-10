
// Write a lambda expression to implement Runnable and start a thread.
public class LambdaRunnableEx {
    public static void main(String[] args) {
        // Creating a Runnable using lambda expression
        Runnable task = () -> {
            System.out.println("Thread is running using lambda!");
        };

        // Starting the thread
        Thread thread = new Thread(task);
        thread.start();
    }
}