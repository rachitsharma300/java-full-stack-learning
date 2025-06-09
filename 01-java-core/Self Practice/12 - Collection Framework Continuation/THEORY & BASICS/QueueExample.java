import java.util.LinkedList;
import java.util.Queue;

public class QueueExample
{
    public static void main(String[] args)
    {
        // Creating a Queue of Strings using LinkedList
        Queue<String> customerQueue = new LinkedList<>();

        // Adding elements to the queue (Enqueue)
        customerQueue.add("Rachit");
        customerQueue.add("Akshita");
        customerQueue.add("Shivika");

        // Print the queue
        System.out.println("Initial Queue: " + customerQueue);

        // Accessing the front element
        System.out.println("First in line: " + customerQueue.peek());

        // Removing an elements (Dequeue)
        String served = customerQueue.remove();
        System.out.println("Served: " + served);
        System.out.println("Queue after serving one: " + customerQueue);
    }
}
