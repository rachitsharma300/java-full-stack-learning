/*
Custom Text Formatter (StringBuilder)
Objective: Practice StringBuilder operations like append(), insert(), delete(), replace().
Problem: Create a simple CLI-based formatter:
•	Takes a sentence as input.
•	Formats it by:
•	Replacing all spaces with underscores.
•	Inserting the word "START_" at the beginning.
•	Appending the word "_END" at the end.
•	Removing all punctuation marks.
Example Input:
Hello, this is a test!

Example Output:
START_Hello_this_is_a_test_END
 */
import java.util.Scanner;

public class CustomTextFormatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scan.nextLine();

        // Remove all punctuation (using regex)
        String cleaned = input.replaceAll("[\\p{Punct}]", "");

        // Replace spaces with underscores
        String underscored = cleaned.replace(" ", "_");

        // Use StringBuilder to format
        StringBuilder sb = new StringBuilder(underscored);
        sb.insert(0, "START_");
        sb.append("_END");

        // Output result
        System.out.println(sb.toString());

        scan.close();
    }
}

