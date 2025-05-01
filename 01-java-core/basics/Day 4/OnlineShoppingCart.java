/*
Online Shopping Cart – Bulk Discount

A user adds multiple items to their cart. Each item has a price and quantity.
If quantity > 5, apply a 10% discount on that item.

Input:
Enter number of items: 2
Item 1 price: 100
Item 1 quantity: 6
Item 2 price: 50
Item 2 quantity: 3

Output:
Item 1 total after discount: 540.0
Item 2 total: 150.0
Final bill: 690.0
 */

import java.util.Scanner;

public class OnlineShoppingCart
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int countItem = scan.nextInt();

        double finalBill = 0;

        for (int i = 1; i <= countItem; i++)
        {
            System.out.print("Item " + i + " price: ");
            double price = scan.nextDouble();

            System.out.print("Item " + i + " quantity: ");
            int quantity = scan.nextInt();

            double total = price * quantity;

            if (quantity > 5)
            {
                total = total * 0.9; // apply 10% discount
                System.out.println("Item " + i + " total after discount: " + total);
            } else {
                System.out.println("Item " + i + " total: " + total);
            }

            finalBill += total;
        }

        System.out.println("Final bill: " + finalBill);

        scan.close();
    }
}
