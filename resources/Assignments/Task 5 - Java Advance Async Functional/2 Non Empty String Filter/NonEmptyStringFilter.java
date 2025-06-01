/*
Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings.
If the given List is: Liststrings Arrays.asList ("abc", "", "bc", "efg", "abcd","", "jkl");
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringFilter
{
    public static void main(String[] args)
    {
     // Creating a List with some Empty and non - Empty Strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Using stream to Filter out empty Strings
        List<String> nonEmptyList = strings.stream()
                                           .filter(str -> !str.isEmpty()) // Keep only non-Empty Strings
                                           .collect(Collectors.toList());      // Collect into new List

        System.out.println("--- OUTPUT ---");
        System.out.println(nonEmptyList);

    }
}

/*
|---------------------------------|
|              OUTPUT             |
|---------------------------------|
|     [abc, bc, efg, abcd, jkl]   |
|_________________________________|
 */