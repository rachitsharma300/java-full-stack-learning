//3. Find the largest of two numbers


import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int num1 = scan.nextInt();

        System.out.println("Enter Second Number :");
        int num2 = scan .nextInt();

        if (num1 > num2)
        {
            System.out.println(num1 + " is Largest. ");
        } else if (num2 > num1)
        {
            System.out.println(num2 + " is Largest. ");
        }
        else
        {
            System.out.println("Both are Equal number !");
        }
        scan.close();
    }
}
