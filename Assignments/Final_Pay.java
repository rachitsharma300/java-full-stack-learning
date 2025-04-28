/*
Write a java program that takes the purchase amount as input and calculates
the final payable amount after applying the discount.

1. If the purchase amount is less than 500, no discount is applied.
2. If the purchase amount is between 500 and 1000, a 10% discount is applied.
3. If the purchase amount is greater than 1000, a 20% discount is applied.
*/

import java.util.Scanner;

public class Final_Pay
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your purchase amount: ");
        double purchaseAmount = scan.nextDouble();
        double finalAmount = purchaseAmount;

        if (purchaseAmount >= 500 && purchaseAmount <= 1000)
        {
            finalAmount = purchaseAmount - (purchaseAmount * 0.10);
        } else if (purchaseAmount > 1000)

        {
            finalAmount = purchaseAmount - (purchaseAmount * 0.20);
        }

        System.out.println("Your payable amount is: " + finalAmount);

        scan.close();
    }
}
