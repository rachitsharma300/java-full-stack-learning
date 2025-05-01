// Write a Program that find a given number is negative or positive.
import java.util.Scanner;
public class Neg_Pos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number to Find Positive or Negative");
        int num = scan.nextInt();

        if (num % 2 == 0)
        {
            System.out.println( num + " : Positive Number");
        }
        else
        {
            System.out.println( num + " : Negative Number");
        }
    }
}
