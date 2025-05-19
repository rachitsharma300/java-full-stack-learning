//1. Check if a number is even or odd


import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any Number : ");
        int num = scan.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Number " + num + " is Even. ");
        }
        else
        {
            System.out.println("Number " + num + " is Odd. ");
        }
    }
}
