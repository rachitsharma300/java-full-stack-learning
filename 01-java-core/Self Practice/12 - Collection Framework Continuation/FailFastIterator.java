// What is fail-fast iterator? Demonstrate with ConcurrentModificationException.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Akki");
        names.add("Shivika");
        names.add("Rachit");

        // Iterator created here
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println(name);

            // Modifying list directly during iteration - not allowed
            if (name.equals("Rachit"))
            {
                names.add("Mausam"); // Structural modification - will throw exception
            }
        }
    }
}
