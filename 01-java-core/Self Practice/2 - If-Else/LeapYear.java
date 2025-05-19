//5. Check if a year is a leap year


import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Year :");
        int year = scan.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
        {
            System.out.println(year + " is Leap Year");
        }
        else
        {
            System.out.println(year + " is not Leap Year");
        }
        scan.close();
    }
}