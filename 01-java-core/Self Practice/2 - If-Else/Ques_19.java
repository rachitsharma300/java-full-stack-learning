/*
Check eligibility for scholarship: Age < 25, GPA > 3.5, Income < 5L.
Input: Age, GPA, Income
Output: "Eligible" or "Not eligible"
 */

import java.util.Scanner;

public class Ques_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you age");
        int age = scan.nextInt();
        System.out.println("Enter your CGPA");
        double gpa = scan.nextDouble();
        long income = scan.nextLong();

        if (age < 25 && gpa > 3.5 && income < 500000)  {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        scan.close();
    }
}
