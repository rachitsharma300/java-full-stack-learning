/*
 Palindrome Sentence Checker (StringBuilder)

Objective: Use StringBuilder.reverse() and string cleaning.
Problem: Write a Java program that checks if a given sentence is a palindrome, ignoring spaces, punctuation, and case.

Example Input:
A man, a plan, a canal, Panama

Example Output:
It's a Palindrome

 */
import java.util.Scanner;

public class PalindromeSentenceChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scan.nextLine();

        // Clean the string (remove spaces, punctuation, and convert to lowercase)
        String cleaned = input.replaceAll("[\\W_]", "").toLowerCase();

        // Use StringBuilder to reverse the cleaned string
        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();

        // Check if the cleaned string is equal to its reverse
        if (cleaned.equals(reversed)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scan.close();
    }
}

