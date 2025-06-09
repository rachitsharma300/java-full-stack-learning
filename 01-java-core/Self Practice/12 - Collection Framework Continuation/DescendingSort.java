// How to sort a List of integers in descending order using Collections.sort()?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingSort
{
    public static void main(String[] args)
    {
        // Creating a list of Integers
        List<Integer> scores = new ArrayList<>(Arrays.asList(85, 92, 78, 96, 88));

        // Sort in Dec Order
        Collections.sort(scores, Collections.reverseOrder());

        //Print the sorted list
        System.out.println("Scores in Dec order: " + scores);
    }
}
