/*
Check the roots of a quadratic equation (real and equal, real and distinct, or imaginary).
Inputs: Coefficients a, b, c
Output: "Real and Equal", "Real and Distinct", "Imaginary"
 */


import java.util.Scanner;

public class Ques_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter coefficient a:");
        double a = scan.nextDouble();

        System.out.println("Enter coefficient b:");
        double b = scan.nextDouble();

        System.out.println("Enter coefficient c:");
        double c = scan.nextDouble();


        double discriminant = (b * b) - (4 * a * c);


        if (discriminant > 0) {
            System.out.println("Roots are Real and Distinct");
        } else if (discriminant == 0) {
            System.out.println("Roots are Real and Equal");
        } else {
            System.out.println("Roots are Imaginary");
        }

        scan.close();
    }
}