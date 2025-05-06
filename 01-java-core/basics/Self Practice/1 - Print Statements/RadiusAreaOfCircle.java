//8. Take input of radius and calculate area of a circle


import java.util.Scanner;

public class RadiusAreaOfCircle
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Radius :");
        double radius = scan.nextDouble();

        // Use With Library
       //  double area = Math.PI * radius * radius;

        double pi = 3.1416; // Use Without Inbuild Library
        double area = pi * radius * radius;

        System.out.println("Area of Circle is : " + area);

        scan.close();
    }
}
