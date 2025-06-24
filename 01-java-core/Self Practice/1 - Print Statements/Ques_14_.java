// Take input of 3 numbers and print the greatest among them.

import java.util.Scanner;

public class Ques_14_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 no separately");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int Greatest;

        if (a >= b && a >= c) {
            Greatest = a;
        } else if (b >= a && b >= c) {
            Greatest = b;
        } else {
            Greatest = c;
        }
        System.out.println("Greatest Number is: " + Greatest);
        scan.close();
    }
}
