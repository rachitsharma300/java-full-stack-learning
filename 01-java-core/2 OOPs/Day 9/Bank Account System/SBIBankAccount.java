/*
Bank Account System
Problem Statement:
Create a class BankAccount with the following:
•	private fields: accountNumber, accountHolder, balance
•	Constructor to initialize the fields
•	Public methods:
o	deposit(double amount)
o	withdraw(double amount)
o	getBalance()
Use validation to ensure:
•	Balance can’t go negative
•	Deposit/withdraw amount should be > 0

Input/Output Example:
Deposit: $500
Withdraw: $200
Balance: $300
 */
import java.util.Scanner;

class SBIBankAccount
{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public SBIBankAccount(String accountNumber, String accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance >= 0 ? balance : 0.0;
    }

    // Deposit Method
    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: $ " + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount. At least $1.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount)
    {
        if (amount > 0)
        {
            if (balance >= amount)
            {
                balance -= amount;
                System.out.println("Withdraw: $ " + amount);
            }
            else
            {
                System.out.println("Insufficient balance.");
            }
        } else
        {
            System.out.println("Invalid withdrawal amount. At least $1.");
        }
    }

    // Get current balance
    public double getBalance()
    {
        return balance;
    }

    // Show account details
    public void showAccount()
    {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance : $ " + balance);
    }

    // Main method to test
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        String accNum = scan.nextLine();

        System.out.println("Enter Account Holder Name:");
        String accHolder = scan.nextLine();

        System.out.println("Enter Initial Balance:");
        double initBalance = scan.nextDouble();

        SBIBankAccount sbiaccount = new SBIBankAccount(accNum, accHolder, initBalance);

        sbiaccount.deposit(500);     // Example deposit
        sbiaccount.withdraw(200);    // Example withdraw

        System.out.println("Final Balance: $ " + sbiaccount.getBalance());

        scan.close();
    }
}
