// Write down the program to reverse the given number using loops.
import java.util.Scanner;
public class Rev_Number
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int Input_Num = scan.nextInt();

        int reversed = 0;

        while (Input_Num != 0)
        {
            int digit = Input_Num % 10;
            reversed = reversed * 10 + digit;
            Input_Num = Input_Num /10;
        }
        System.out.println("Reversed Number : " + reversed);
        scan.close();
    }
}
