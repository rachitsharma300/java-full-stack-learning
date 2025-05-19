/*
. Email Validation – Stop on Invalid Email (Use break)
Ask the user to input 5 email addresses. If any email is invalid (missing "@"), stop processing.
Sample Input:
Enter 5 emails:
alice@example.com
bob@domain.com
charlie.domain.com
dave@example.com
eve@test.com

Expected Output:
Valid: alice@example.com
Valid: bob@domain.com
Invalid email found: charlie.domain.com – Stopping batch.
 */
import java.util.Scanner;
public class EmailValidation
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] Email = new String[5];
        for (int i =0; i <5; i ++)
        {
            Email[i] = scan.nextLine();

            if (!Email[i].contains("@"))
            {
                System.out.println("Envalid Email Found :" + Email[i] + " – Stopping batch");
                break;
            }
            System.out.println("Valid Emails :" + Email[i]);
        }
            scan.close();
    }
}
