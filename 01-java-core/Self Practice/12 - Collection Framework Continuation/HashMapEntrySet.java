// Write a program to iterate over HashMap using entrySet().

import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySet
{
    public static void main(String[] args)
    {
        Map<String, Integer> productPrices = new HashMap<>();

        // Adding key-value pairs
        productPrices.put("Laptop", 90000);
        productPrices.put("Mobile", 85000);
        productPrices.put("Tablet", 80000);

        // Iterating using entrySet()
        System.out.println("Product Price List");
        for (Map.Entry<String, Integer> entry : productPrices.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
