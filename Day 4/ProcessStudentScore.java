/*
5. Process Student Scores – Skip Failures (Use continue)
Ask the user to enter scores of 5 students. Skip scores less than 40 (fail).
Sample Input:
Enter 5 scores:
75 39 60 20 85

Expected Output:
Passed: 75
Failed – skipped
Passed: 60
Failed – skipped
 */
import java.util.Scanner;
public class ProcessStudentScore
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[] score = new double[5];

        for (int i = 0; i <5; i ++)
        {
            score[i] = scan.nextDouble();
            if (score[i] < 40) {
                System.out.println("Failed - Skipped ");
                continue;
            }
            System.out.println("Passed :" + score[i]);
        }
        scan.close();
    }
}
