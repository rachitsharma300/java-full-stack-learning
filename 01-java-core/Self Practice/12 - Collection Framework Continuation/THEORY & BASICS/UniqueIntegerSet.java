// Write a program that stores unique integers in a HashSet and prints them

import java.util.HashSet;
import java.util.Set;

public class UniqueIntegerSet
{
    public static void main(String[] args)
    {
        Set<Integer> uniqueNumbers = new HashSet<>();

        //  Adding numbers, including some dupilcate
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(30);
        uniqueNumbers.add(40);
        uniqueNumbers.add(20); // duplicate
        uniqueNumbers.add(50);
        uniqueNumbers.add(60);
        uniqueNumbers.add(10); // duplicate

        // Print the unique numers
        System.out.println("Unique Integer in HashSet:");

        for (Integer number : uniqueNumbers)
        {
            System.out.println(number);
        }
    }
}
