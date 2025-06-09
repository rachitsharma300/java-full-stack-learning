import java.util.PriorityQueue;

public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(80);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(60);
        pq.add(70);
        pq.add(40);

        // Printing elements in natural (asc) Order
        System.out.println("Elements in PriorityQueue ( natural order):");

        while (!pq.isEmpty())
        {
            System.out.println(pq.poll()); // poll() removes and return head (lowest)
        }
    }
}
