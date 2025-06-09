// Use Iterator to remove all odd numbers from an ArrayList.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveOddNumbers
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();

        // Adding integers 1 to 10
        for (int i =1; i <= 10; i++)
        {
            numbers.add(i);
        }
        System.out.println("Original List: " + numbers);

        // Creating Iterator
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext())
        {
            int num = it.next();
            if (num % 2 != 0)
            {
                it.remove(); // remove if Odd
            }
        }

        System.out.println("After removing odd numbers: " + numbers);
    }
}
