/*
Check if a number is a palindrome
Input: A number
Output: "Palindrome" or "Not a palindrome"
 */

import java.util.Scanner;

public class Ques_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int origianl = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (origianl == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scan.close();
    }
}
