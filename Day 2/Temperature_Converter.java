import java.util.*;
public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Celsius <=> Fahrenheit");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice \n1 or 2 ");

        int choice = scan.nextInt();

        double Celsius;
        double Fahrenheit;

        if (choice == 1)
        {
            System.out.println("Enter Your Celsius Value :");
            Celsius = scan.nextDouble();
            Fahrenheit = (Celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit " + Fahrenheit);
        } else if (choice == 2)
        {
            System.out.println("Enter Your Fahrenheit Value");
            Fahrenheit = scan.nextDouble();
            Celsius = (Fahrenheit - 32) * 5/9;
            System.out.println("Temperature Your Celsius " + Celsius);
        }
        else
        {
            System.out.println("Invalid Choice !");
        }

        scan.close();
    }
}
