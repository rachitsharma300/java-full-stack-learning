/*
Check if a person can drive (age ≥ 18) and has a license (Y/N).
Inputs: Age and license status
Output: "Can drive" or "Cannot drive"
 */

import java.util.Scanner;

public class Ques_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Do You have License ( true or false )");
        boolean license = scan.nextBoolean();

        if (age  >= 18 && license) {
            System.out.println("Can Drive");
        } else {
            System.out.println("Cannot drive");
        }
        scan.close();
    }
}
