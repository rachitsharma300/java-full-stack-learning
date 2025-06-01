/*
Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age,
you have to help him to build this app using the java.time.LocalDate class.

Input:
Enter your birthdate (yyyy-mm-dd): 1990-05-15

Output:
Your age is: 33 years, 4 months, and 13 days
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Taking Input from User
        System.out.println("Enter Your Birthdate (yyyy-mm-dd): ");
        String input = scan.nextLine();

        // Parsing input  string to LocalDate
        LocalDate birthDate = LocalDate.parse(input);

        // Getting current date
        LocalDate currentDate = LocalDate.now();

        //Calculate the D/W current date and Birth Date
        Period age = Period.between(birthDate, currentDate);

        System.out.println("Your age is : "
                + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days");

        scan.close();
    }
}

/*
|---------------------------------------------------|
|             ---- OUTPUT PROGRAM ----              |
|---------------------------------------------------|
|                      INPUT                        |
|   Enter your birthdate (yyyy-mm-dd): 1990-05-15   |
|---------------------------------------------------|
|                      OUTPUT                       |
|          [Anish, Abhi, Akash, Alok]               |
|___________________________________________________|
 */
