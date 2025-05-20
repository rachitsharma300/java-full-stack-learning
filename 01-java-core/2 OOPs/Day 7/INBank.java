/*
Bank Account Management
🔹 Objective:
Use constructors, method types, and variable types.
🔹 Requirements:
•	Create a class BankAccount.
•	Instance variables: accountHolder, balance.
•	Static variable: bankName.
•	Constructors: one no-arg constructor and one parameterized constructor.
•	Method deposit(double amount) (void, with parameter).
•	Method getBalance() (return type, no parameter).
🔹 Input:
BankAccount acc1 = new BankAccount("Riya", 5000);
acc1.deposit(2000);
System.out.println("Balance: " + acc1.getBalance());
🔹 Output:
Balance: 7000.0
 */

class INBank
{
    String accountHolder;
    double balance;

    static String bankName = " SBI Bank";

    INBank()
    {
        accountHolder = "ANONYMOUS";
        balance = 0.0;
    }
    INBank(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount)
    {
        balance += amount;
    }
    double getBalance()
    {
        return balance;
    }

    public static void main(String[] args)
    {
        INBank account1 = new INBank("Rachit", 5000);
        account1.deposit(2000);
        System.out.println("Balance :" + account1.getBalance());
    }
}