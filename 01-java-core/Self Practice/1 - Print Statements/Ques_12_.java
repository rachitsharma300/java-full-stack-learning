// Take input of a number and print whether it is even or odd.


import java.util.Scanner;

public class Ques_12_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your No.");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is a even No.");
        } else {
            System.out.println(num + " is a odd No.");
        }
    }

}
