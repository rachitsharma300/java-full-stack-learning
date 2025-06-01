/*
You are a teacher in school In your class there are 10 students, you have decided to give special gifts to those
students whose names start with "A" you are asked to separate those students with the help of a java program.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GiftForAStudent
{
    public static void main(String[] args) {
        // list of Student names in the class
        List<String> students = Arrays.asList("Rachit", "Rahul", "Anish", "Saurav", "Abhi",
                                              "Rohan", "Akash", "Kajal", "Komal", "Alok");

        // Filtering students whose names starts with A.
        List<String> specialGiftList = students.stream()
                .filter(name -> name.startsWith("A")) // Only names starting with A
                .collect(Collectors.toList());              // Collect to a new List

        System.out.println("Students who will receive special gifts: ");
        System.out.println(specialGiftList);
    }
}

/*
|-----------------------------------------------|
|                     OUTPUT                    |
|-----------------------------------------------|
|    Students who will receive special gifts:   |
|          [Anish, Abhi, Akash, Alok]           |
|_______________________________________________|
 */
