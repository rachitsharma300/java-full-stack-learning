//6. Input marks and print grade (A/B/C/Fail)


import java.util.Scanner;

public class PrintGrade
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Marks");
        int marks = scan.nextInt();

        if (marks >= 90)
        {
            System.out.println("Grade: A");
        }
        else if (marks >= 80)
        {
            System.out.println("Grade: B");
        }
        else if (marks >= 50)
        {
            System.out.println("Grade: C");
        }
        else if (marks >= 33)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Fail");
        }
        scan.close();
    }
}
