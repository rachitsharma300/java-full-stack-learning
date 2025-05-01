import java.util.Scanner;
public class Loan_Emi_Tracker
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Loan Amount :");
        double Loan_amount = scan.nextDouble();
        System.out.println("Enter Your Emi Per Month :");
        double Emi_Per_Month = scan.nextDouble();

        int month = 1;

        do
        {
        Loan_amount -= Emi_Per_Month;
        if (Loan_amount < 0)
        {
            Loan_amount = 0;
        }
            System.out.println("Month " + month + ": Remaining balance = " + Loan_amount);
        month++;

        }
        while (Loan_amount > 0);

        System.out.println("Total months to repay loan: " + (month - 1));
    }
}
