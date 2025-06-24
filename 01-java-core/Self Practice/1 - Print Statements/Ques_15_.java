// Input a number and print whether it's positive, negative, or zero.

import java.util.Scanner;

public class Ques_15_  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + " as a Zero");
        }
        scan.close();
    }
}
