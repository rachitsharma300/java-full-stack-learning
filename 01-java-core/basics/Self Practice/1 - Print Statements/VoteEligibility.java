//6. Input age and print if eligible to vote (use only System.out.print)

import java.util.Scanner;

public class VoteEligibility
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = scan.nextInt();

        if (age >= 18)
        {
            System.out.println("Congratulations You are Eligible for Vote");
        }
        else
        {
            System.out.println("SORRY Baby Wait for 18");

            scan.close();
        }
    }
}
