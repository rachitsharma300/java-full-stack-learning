// Take a number input and print the reverse of that number.
//(Example: Input: 1234 → Output: 4321)

import java.util.Scanner;

public class Ques_18_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int reverse = 0;

//        while (num != 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num = num / 10;
//        }
        // Using For Loops
        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }




        System.out.println("Reversed No: " + reverse);
    }
}
