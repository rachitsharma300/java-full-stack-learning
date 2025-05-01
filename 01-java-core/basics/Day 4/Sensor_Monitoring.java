/*
3. Sensor Monitoring – Stop on Critical Alert (Use break)
Ask the user to enter temperature readings (up to 10). Stop immediately if any reading exceeds 100.
📥 Sample Input:
Enter 6 temperature readings:
45 60 78 102 87 90

📤 Expected Output:
Reading: 45
Reading: 60
Reading: 78
Critical temperature detected: 102°C – Stopping monitoring.
 */
import java.util.Scanner;
public class Sensor_Monitoring
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] temperature = new double[10];

        for (int i = 0; i<10; i ++)
        {
            temperature[i] = scan.nextDouble();

            if (temperature[i] > 100) {
                System.out.println("Critical temperature detected: " + temperature[i] + "°C – Stopping monitoring.");
                break;
            }
            System.out.println("Reading: " + temperature[i]);
        }
        scan.close();

    }
}
