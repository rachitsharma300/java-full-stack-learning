/*
2. Scan Product Prices – Skip Invalid (Use continue)
Ask the user to input prices of 5 products. Some prices may be negative due to input error.
Skip negative prices and display only valid ones.

Sample Input:
Enter 5 product prices:
12.99 -1.0 0.0 15.5 -3.75

Expected Output:
Valid price: 12.99
Valid price: 0.0
Valid price: 15.5

 */
import java.util.Scanner;
public class ScanProductPrice
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] price = new double[5];

        System.out.println("Enter 5 Products Price :");

        for (int i = 0; i <5; i ++)
        {
            price[i]=scan.nextDouble();

            if (price[i] < 0)
            {
                continue;
            }
            System.out.println("Valid Price " + price[i]);
        }
        scan.close();
    }
}
