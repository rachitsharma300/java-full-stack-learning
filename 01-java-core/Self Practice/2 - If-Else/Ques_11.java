//11. Check if a character is uppercase or lowercase.
//Input: A character
//Output: "Uppercase" or "Lowercase"
import java.util.Scanner;

public class Ques_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter any sentence");
        String input = scan.nextLine();

        if (input == input.toLowerCase()) {
            System.out.println("Lowercase");
        } else if (input == input.toUpperCase()) {
            System.out.println("Uppercase");
        } else {
            System.out.println("Sentence mix in lower and upper both");
        }

//  Checking for Entire Sentence
//        System.out.print("Enter a single character: ");
//        char ch = scan.next().charAt(0);
//
//        if (Character.isUpperCase(ch)) {
//            System.out.println("Uppercase");
//        } else if (Character.isLowerCase(ch)) {
//            System.out.println("Lowercase");
//        } else {
//            System.out.println("Not an alphabet character");
//        }
        scan.close();
    }
}
