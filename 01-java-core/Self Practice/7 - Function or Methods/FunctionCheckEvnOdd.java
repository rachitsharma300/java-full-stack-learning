import java.util.Scanner;

public class FunctionCheckEvnOdd
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any number to Check EVEN or ODD !");
        long num = scan.nextLong();

        if (num % 2 == 0)
        {
            System.out.println(num + " is a Even Number !");
        }
        else
        {
            System.out.println(num + " is a Odd Number ! ");
        }

    }
}