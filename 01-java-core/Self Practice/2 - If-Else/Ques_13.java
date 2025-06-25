//  Check whether a person is eligible to vote (age ≥ 18).
// Input: Age
// Output: "Eligible" or "Not eligible"

import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        scan.close();
    }
}
