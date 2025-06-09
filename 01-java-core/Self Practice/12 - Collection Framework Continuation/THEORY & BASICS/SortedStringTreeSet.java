import java.util.Set;
import java.util.TreeSet;

public class SortedStringTreeSet
{
    public static void main(String[] args)
    {
        // TreeSet automatically stores elements in sorted order
        Set<String> names = new TreeSet<>();

        // Adding 5 Strings
        names.add("Banana");
        names.add("Apple");
        names.add("Mango");
        names.add("Grapes");
        names.add("Orange");

        // Print strings in sorted order
        System.out.println("Strings in sorted order (TreeSet):");
        for (String name : names)
        {
            System.out.println(name);
        }
    }
}
