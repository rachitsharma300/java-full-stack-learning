/*
ATM Cash Withdrawal Simulation
Simulate an ATM machine. The user enters a PIN and can perform operations: check balance,
deposit, withdraw, or exit. The loop continues until the user chooses to exit.
Input:
Enter PIN: 1234
Choose option:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Option: 2
Enter deposit amount: 500
Option: 1
Balance: 500
Option: 4

Output:
Deposit successful.
Balance: 500
Thank you for using the ATM.
 */
import java.util.Scanner;
public class AtmCashWithdrawalSimulation
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin = 1234;
        Double balance = 0.0;

        System.out.println("Enter Your Pin : ");

        int enterPin = scan.nextInt();

        if (enterPin == pin)
        {
            while (true)
            {
                System.out.println("\n Choose Options");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.println("Option :" );
                int option = scan.nextInt();

                switch (option)
                {
                    case 1:
                        System.out.println("Balance " + balance);
                        break;

                    case 2:
                        System.out.println("Enter Deposit Amount");
                        int depositMoney = scan.nextInt();
                        if (depositMoney > 0)
                        {
                            balance += depositMoney;
                            System.out.println("Deposit Successfully ");
                        }
                        else
                        {
                            System.out.println("Envalid Amount ");
                        }
                        break;
                    case 3:
                        System.out.println("Enter Withdraw Amount : ");
                        int withDrawAmount = scan.nextInt();
                        if (withDrawAmount > 0 && withDrawAmount <= balance)
                        {
                            balance -= withDrawAmount;
                            System.out.println("Withdraw Successfully ");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance Or Invalid Amount");
                        }
                        break;

                    case 4:
                        System.out.println("Thank You For Using the ATM '_'");
                        return;

                    default:
                        System.out.println("Invalid Option: Try Again !");
                }
            }
        }
        else
        {
            System.out.println("Incorrect Pin Access Denied !");
        }
    }
}
