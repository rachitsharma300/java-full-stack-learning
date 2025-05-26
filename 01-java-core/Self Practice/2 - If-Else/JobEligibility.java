import java.util.Scanner;

public class JobEligibility
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter gender (Male/Female): ");
        String gender = scan.nextLine().trim().toLowerCase();

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        // Job eligibility logic
        if (age < 20 || age > 60)
        {
            System.out.println("Not eligible for any job.");
        }
        else
        {
            if (gender.equals("male"))
            {
                System.out.println("Eligible for: Office Work");
            }
            else if (gender.equals("female"))
            {
                if (age <= 35)
                {
                    System.out.println("Eligible for: Urban Area Job Only");
                }
                else
                {
                    System.out.println("Not eligible for job.");
                }
            }
            else
            {
                System.out.println("Invalid gender input.");
            }
        }

        scan.close();
    }
}
