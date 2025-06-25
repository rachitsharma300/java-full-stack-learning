/*
Check if a given year is a century year.
Condition: Century years are divisible by 100
Output: "Century year" or "Not a century year"
*/

import java.util.Scanner;

public class Ques_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scan.nextInt();

        if (year % 100 == 0){
            System.out.println("Century Year");
        } else {
            System.out.println("Not a century year!");
        }
        scan.close();
    }
}
