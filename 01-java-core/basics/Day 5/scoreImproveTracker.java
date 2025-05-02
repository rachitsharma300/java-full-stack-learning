/*
Score Improvement Tracker
Given a student's test scores over time, determine how many times their score increased compared to the previous test.

Input:
int[] scores = {70, 75, 73, 80, 85, 82};

Expected Output:
Number of Improvements: 3

Explanation: Score improved from 70→75, 73→80, 80→85.
 */

import java.util.Scanner;

public class scoreImproveTracker
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         // Take Input total subject
        System.out.println("Enter Total Subject :");
        int[] score = new int[scan.nextInt()];

        System.out.println("Enter Student Score :");
        // Take input subject wise
        for (int i = 0; i < score.length; i ++)
        {
            System.out.print("Score " + (i + 1)+ ": ");
            score[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 1; i < score.length; i ++) {
            if (score[i] > score[i - 1]) {
                count++;
            }
        }
            System.out.println("Number Of Improvements :" + count);

        scan.close();
    }
}
