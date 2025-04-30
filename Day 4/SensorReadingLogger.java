/*
# Sensor Reading Logger
Take 10 temperature readings and store them as Double objects in a list.
 Find how many readings are above 37.5°C (fever cases).
Input:
Enter 10 temperature readings:
36.2 37.8 38.1 36.5 39.0 37.4 36.9 38.2 37.0 36.8

Output:
Total fever cases: 4

Concepts Used:
•	Wrapper class Double
•	Autoboxing from double to Double
•	Unboxing during comparisons
 */
import java.util.ArrayList;
import java.util.Scanner;
public class SensorReadingLogger
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> temperature = new ArrayList<>();

        System.out.println("Enter 10 Temperature Reading :");
        // Taking Input from users
        for (int i = 0; i < 10; i ++)
        {   // Primitive input
            double temp = scan.nextDouble();
            // Autoboxing to Double
            temperature.add(temp);
        }
        int feverCount = 0;

        // Checking how many are above 37.5 fever cases
        for (Double temp : temperature)
        {
            if (temp > 37.5)
            {
                feverCount++;
            }
        }
        System.out.println("Total fever cases :" + feverCount);
        scan.close();
    }
}
