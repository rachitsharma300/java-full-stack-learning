import java.util.Scanner;
public class Factorial_Number
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number !");

        int num = scan.nextInt();
        int factrail = 1;

        for( int i = 1; i <= num; i ++)
        {
            factrail *= i;
        }
        System.out.println("Factrial of " + num + "  is :" + factrail);

    }
}
