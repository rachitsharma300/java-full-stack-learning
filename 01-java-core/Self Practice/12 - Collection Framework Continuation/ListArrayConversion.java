import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion
{
    public static void main(String[] args)
    {
        // --- Convert List to Array ---
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // List to Array (String[])
        String[] fruitArray = fruits.toArray(new String[0]);

        System.out.println("List to Array: ");
        for (String fruit : fruitArray)
        {
            System.out.println(fruit);
        }

        // --- Convert Array to List
        String[] colors = {"Red", "Green", "Blue"};

        // Array to List (Fixed-size list)
        List<String> colorList = Arrays.asList(colors);

        System.out.println("\nArray to List");
        for (String color : colorList)
        {
            System.out.println(color);
        }

        // Optional: Convert to modification list
        List<String> modificationList = new ArrayList<>(colorList);
        modificationList.add("Yellow");
        System.out.println("\nModification List: " + modificationList);
    }
}
