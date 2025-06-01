// Function to add two numbers

import java.util.Scanner;
public class TwoNumberFunction
{
    public static int add (int a, int b)
    {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first Number");
        int a = scan.nextInt();
        System.out.println("Enter Second Number");
        int b = scan.nextInt();

        int sum = add(a, b);
        System.out.println("Sum : " + sum);
    }
}