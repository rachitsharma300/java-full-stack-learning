// Check whether a triangle is valid or not using angles.
// Condition: Sum of all 3 angles should be 180°
// Output: "Valid triangle" or "Invalid triangle"

import java.util.Scanner;

public class Ques_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int DegA = scan.nextInt();
        int DegB = scan.nextInt();
        int DegC = scan.nextInt();

        if (DegA + DegB + DegC == 180 && DegA > 0 && DegB > 0 && DegC > 0) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
        scan.close();
    }
}
