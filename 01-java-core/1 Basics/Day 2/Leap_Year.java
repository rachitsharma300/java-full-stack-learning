import java.util.*;
public class Leap_Year
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year to Check Leap Year or Not");
        int year = scan.nextInt();

        if (year % 4 == 0)
        {
            if (year % 100 != 0 || year % 400 == 0)
            {
                System.out.println("This Year is Leap Year  :- " + year);
            }
            else
            {
                System.out.println("This Year is not Leap Year :- " + year);
            }
        }
        else
        {
            System.out.println("This Year is not Leap Year :- " + year);
        }
    }
}