// Create an ArrayList and add 5 integers. Print them.

import java.util.ArrayList;
import java.util.List;

public class FiveIntegers
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("ArrayList of 5 Int: " +numbers);

    }
}
