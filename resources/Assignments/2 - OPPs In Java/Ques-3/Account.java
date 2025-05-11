public class Account
{
        double balance;

        // No-argument constructor (default balance set to 0)
        public Account()
        {
            balance = 0.0;
        }
        // Parameterized constructor to set initial balance
        public Account(double initialBalance)
        {
            balance = initialBalance;
        }
        // Method to deposit amount
        public void deposit(double amount)
        {
            if (amount > 0)
            {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }
            else
            {
                System.out.println("Invalid deposit amount.");
            }
        }
        // Method to withdraw amount
        public void withdraw(double amount)
        {
            if (amount > 0 && amount <= balance)
            {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
            else
            {
                System.out.println("Invalid or insufficient balance.");
            }
        }
        // Method to display current balance
        public void displayBalance()
        {
            System.out.println("Current Balance: " + balance);
        }
    }