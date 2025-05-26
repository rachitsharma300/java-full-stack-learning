//Input marks and print grade (A/B/C/Fail)

import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter your marks (0-100): ");
        int marks = scan.nextInt();

        // Grade logic
        if (marks >= 85 && marks <= 100)
        {
            System.out.println("Grade: A");
        }
        else if (marks >= 70 && marks < 85)
        {
            System.out.println("Grade: B");
        }
        else if (marks >= 50 && marks < 70)
        {
            System.out.println("Grade: C");
        }
        else if (marks >= 0 && marks < 50)
        {
            System.out.println("Grade: Fail");
        }
        else {
            System.out.println("Invalid marks. Please enter a number between 0 and 100.");
        }

        scan.close();
    }
}
