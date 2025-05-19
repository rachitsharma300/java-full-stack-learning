/*
🧩 Assignment 2: Bank System – Instance Variables, this Keyword
🔹 Objective:
Understand how to use this keyword to differentiate between local and instance variables.
📝 Task:
Create a class BankAcc with:
•	Instance variables: accountHolder, balance
•	Constructor with same parameter names
•	Use this to assign values
•	A method showDetails() to display values
BankAcc(String accountHolder, double balance) {
    this.accountHolder = accountHolder;
    this.balance = balance;
}
✅ Expected Output:
Account Holder: Alice

 */
 class BankAccount
{
        // Instance variables
        String accountHolder;
        double balance;

        // Constructor using 'this' to diff b/w instance and local variables
        BankAccount(String accountHolder, double balance)
        {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // Method to display account details
        void showDetails()
        {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }

        // Main method to test the class
        public static void main(String[] args)
        {
            BankAccount account = new BankAccount("Alice", 1000.50);
            account.showDetails();
        }
    }
