// Take a list of comma-separated integers as input and print the average.
//(Example: Input: 10,20,30 → Output: Average is 20.0)
import java.util.Scanner;

public class Ques_19_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = sentence.trim().split("\\s+");

        // Count and Output
        System.out.println("Total number of words: " + words.length);

        scan.close();
    }
}
