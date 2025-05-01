/*
# Voting Eligibility Checker
Ask the user to input age values of people at an event. Store them as Integer.
 Count how many are eligible to vote (18+).

Input:
Enter ages of 6 people:
17 21 16 45 18 19

Output:
Eligible voters: 4

Concepts Used:
•	Boxing int to Integer
•	Unboxing for comparison (>= 18)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class VotingEligibilityChecker
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> Ages = new ArrayList<>();
        System.out.print("Enter 6 People Age :\n");

        for (int i = 0; i < 6; i ++)
        {
            int age = scan.nextInt();
            Ages.add(age);
        }
        int EligileCount = 0;

        for (Integer age : Ages)
        {
            if (age >= 18)
            {
                EligileCount++;
            }
        }
        System.out.println("Eligible Voters :" + EligileCount);
        scan.close();
    }
}
