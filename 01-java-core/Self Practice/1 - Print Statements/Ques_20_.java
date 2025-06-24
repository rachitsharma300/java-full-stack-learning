// Take a list of comma-separated integers as input and print the average.
//(Example: Input: 10,20,30 → Output: Average is 20.0)
import java.util.Scanner;

public class Ques_20_ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter comma-separated integers:");
        String input = scan.nextLine();  // Example: 10,20,30

        String[] nums = input.split(",");  // Split by comma
        int sum = 0;

        for (String num : nums) {
            sum += Integer.parseInt(num.trim());  // Trim and convert to int
        }

        double average = (double) sum / nums.length;

        System.out.println("Average is " + average);

        scan.close();

    }
}
