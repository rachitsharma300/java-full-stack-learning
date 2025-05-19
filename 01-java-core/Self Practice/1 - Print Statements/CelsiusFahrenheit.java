//7. Input temperature in Celsius and convert to Fahrenheit


import java.util.Scanner;

public class CelsiusFahrenheit
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Temperature in Celsius");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit " + fahrenheit);

        scan.close();
    }
}
