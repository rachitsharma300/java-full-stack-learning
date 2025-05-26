import java.util.Scanner;

public class CalculatorMenu
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            // Display menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = scan.nextInt();

            if (choice == 5)
            {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }


            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();

            // Perform operation
            switch (choice)
            {
                case 1:
                    System.out.println("Result = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result = " + (num1 * num2));
                    break;
                case 4:
                    if
                    (num2 != 0)
                    {
                        System.out.println("Result = " + (num1 / num2));
                    }
                    else
                    {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 to 5.");
            }
        }

        scan.close();
    }
}
