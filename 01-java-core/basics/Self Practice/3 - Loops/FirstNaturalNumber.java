//Print sum of first N natural numbers
import java.util.Scanner;

public class FirstNaturalNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = N * (N + 1) / 2;
        System.out.println(sum);
        scan.close();
    }
}
