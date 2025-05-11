/*
Create Class Account with data member as Balance. Create two constructors (no argument,
and with argument) and perform following task.
a. method to deposit the amount to the account.
b. methond to withdraw the amount from the account.
c. method to display the Balance.
 */
public class AccountMain {
    public static void main(String[] args) {

        // Creating account with no-arg constructor (balc= 0)
        Account acc1 = new Account();
        acc1.deposit(1000);
        acc1.withdraw(300);
        acc1.displayBalance();

        System.out.println();

        // Creating account with init balance using parameterized constructor
        Account acc2 = new Account(5000);
        acc2.deposit(2000);
        acc2.withdraw(1000);
        acc2.displayBalance();
    }
}

// Expected Output:
/*
Deposited: 1000.0
Withdrawn: 300.0
Current Balance: 700.0

Deposited: 2000.0
Withdrawn: 1000.0
Current Balance: 6000.0
*/
