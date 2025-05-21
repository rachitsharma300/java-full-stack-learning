/*
ATM Withdrawal System
🔹 Objective:
Simulate an ATM system that:
•	Allows withdrawal from a bank account.
•	Throws a custom exception if withdrawal amount exceeds balance.
🔧 Concepts Used:
•	Custom Exception
•	throw and throws
•	try-catch-finally
📌 Instructions:
•	Input: Current balance and withdrawal amount.
•	If withdrawal amount > balance → throw InsufficientBalanceException.
•	Always print "Transaction completed." in finally.
💡 Sample Input & Output:
Enter balance: 5000
Enter withdrawal amount: 7000
Exception: Insufficient balance!
Transaction completed.
*/
import java.util.Scanner;

public class AtmWithdrawSystem
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter balance: ");
        int balance = scan.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int amount = scan.nextInt();

        try
        {
            if (amount > balance)
            {
                throw new InsufficientBalanceException("Exception: Insufficient balance!");
            }
            else
            {
                balance -= amount;
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: " + balance);
            }
        } catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        } finally
        {
            System.out.println("Transaction completed.");
        }

        scan.close();
    }
}
