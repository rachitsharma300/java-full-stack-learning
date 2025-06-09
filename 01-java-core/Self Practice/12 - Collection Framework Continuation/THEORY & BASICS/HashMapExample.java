import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
        // Creating a HashMap of String keys and Integer values
        Map<String, Integer> marks = new HashMap<>();

        // Adding key-value pairs to the HashMap
        marks.put("DSA", 90);
        marks.put("OPS", 95);
        marks.put("Java", 85);

        // Pirnt all entries
        System.out.println("Subject Marks:");
        for (Map.Entry<String, Integer> entry : marks.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
