/*
 Student Marks Analyzer
You are given the marks of a student in 5 subjects. Write a program to calculate
and print the average, highest, and lowest marks.

Input:
int[] marks = {78, 85, 62, 90, 71};

Expected Output:
Average Marks: 77.2
Highest Marks: 90
Lowest Marks: 62
 */

import java.util.Scanner;

public class StudentMarksAnalyzer
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];  // 5 subjects
        int sum = 0;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scan.nextInt();
            sum += marks[i];
        }

        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < 5; i++)
        {
            if (marks[i] > highest)
            {
                highest = marks[i];
            }
            if (marks[i] < lowest)
            {
                lowest = marks[i];
            }
        }

        double average = (double) sum / 5;

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        scan.close();
    }
}
