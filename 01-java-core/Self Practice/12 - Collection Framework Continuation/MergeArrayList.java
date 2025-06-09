// Write a program to merge two ArrayLists.

import java.util.ArrayList;
import java.util.List;

public class MergeArrayList
{
    public static void main(String[] args)
    {
        // Class A Student
        List<String> classA = new ArrayList<>();
        classA.add("Rachit");
        classA.add("Shivika");
        classA.add("Akki");

        // Class B Student
        List<String> classB = new ArrayList<>();
        classB.add("Mausam");
        classB.add("Priya");
        classB.add("Saurav");

        // Merging Both classes
        List<String> mergedClass = new ArrayList<>(classA); // start with classA
        mergedClass.addAll(classB); // add classB students

        System.out.println("List A: " + classA);
        System.out.println("List B: " + classB);

        // Display the merged list
        System.out.println("Merged Student List: " + mergedClass);
    }
}
