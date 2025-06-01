/*
Write a program using map() method, to convert a list of Strings into uppercase.
If the given List is: Stream names = Stream.of("aBc", "d", "ef");
*/


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseConverter
{
    public static void main(String[] args)
    {
        // Creating a stream of lowercase & mixed case Strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        //Using Map() to convert each string to uppercase
        List<String> upperCaseList = names
                .map(str -> str.toUpperCase()) // convert each string to uppercase
                .collect(Collectors.toList());       // collect results into a List


        System.out.println("-- Output --");
        System.out.println(upperCaseList);
    }
}


/*
|--------------------------|
|          OUTPUT          |
|--------------------------|
|       [ABC, D, EF]       |
|__________________________|
 */