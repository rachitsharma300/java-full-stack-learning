// Check if the input number is a three-digit number.
//Input: An integer
//Output: "Three-digit number" or "Not a three-digit number"

import java.util.Scanner;

public class Ques_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999)) {
            System.out.println("Three-digit number");
        } else {
            System.out.println("Not a three-digit number");
        }
        scan.close();
    }
}
