// Write a program demonstrating unmodifiable Collection using Collections.unmodifiableList()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList
{
    public static void main(String[] args)
    {
        // Step 1 : Create a modifiable List
        List<String> modifiableList = new ArrayList<>();
        modifiableList.add("Apple");
        modifiableList.add("Banana");
        modifiableList.add("Cherry");

        // Step 2: Create an unmodifiable view of the list
        List<String> unmodifiableList = Collections.unmodifiableList(modifiableList);
        System.out.println("Original List: " + unmodifiableList);

        //Step 3: Try modifying the unmodifiable list
        System.out.println("\n Trying to add 'Dragonfruit' to unmodifiable list ..." );
        try
        {
            unmodifiableList.add("Dragonfruit"); // this will throw error
        }
        catch (UnsupportedOperationException e)
        {
            System.out.println("Exception Caught" + e);
        }

        // The original modifiable list can still be changed
        modifiableList.add("Elderberry");
        System.out.println("\nModified original list: " + modifiableList);

        // The unmodifiable list reflects changes in the original list
        System.out.println("Unmodifiable list (after original list modified): " + unmodifiableList);
    }
}
