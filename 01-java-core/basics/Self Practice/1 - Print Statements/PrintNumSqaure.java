//4. Input a number and print its square


import java.util.Scanner;

public class PrintNumSqaure
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = scan.nextInt();

        int square = num * num;
        System.out.println("Square of " + num + " is : " + square);

        scan.close();
    }
}
