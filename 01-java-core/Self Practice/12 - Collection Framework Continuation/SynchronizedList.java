// Create a synchronized List using Collections.synchronizedList().

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList
{
    public static void main(String[] args)
    {
        // Create a regular ArrayList
        List<String> unsafeList = new ArrayList<>();

        // Convert it to a synchronized list
        List<String> safelist = Collections.synchronizedList(unsafeList);

        // Adding elements (safe from multiple threads)
        safelist.add("Java");
        safelist.add("DSA");
        safelist.add("OPS");

        // Iteration should be synchronized manually
        synchronized (safelist)
        {
            for (String lang : safelist)
            {
                System.out.println(lang);
            }
        }
    }
}
