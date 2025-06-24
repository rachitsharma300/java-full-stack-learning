// Take two numbers as input and swap their values. Then print the swapped numbers.

import java.util.Scanner;

public class Ques_17_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Ater Swap: " + num1 + " " + num2);

    }
}
