import java.util.Scanner;
public class Gym_Workout_Tracker
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your 7 Days Workout Time in Minutes:");
        double[] day = new double[7];

        for (int i = 0; i < 7; i++)
        {
            day[i] = scan.nextDouble();
        }

        double totalWorkout = 0;
        for (int i = 0; i < 7; i++) 
        {
            totalWorkout += day[i];
        }

        double totalCalories = totalWorkout * 5;
        double averageCalories = totalCalories / 7;

        System.out.println("Total calories burned: " + totalCalories);
        System.out.println("Average per day: " + averageCalories);
    }
}
