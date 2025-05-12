/*
🧾 Assignment 3: Password Strength Checker (String & StringBuilder)
Objective: Use both String and StringBuilder to analyze and transform input.
Problem: Create a password checker that:
•	Validates password based on:
•	At least 8 characters
•	At least one digit
•	At least one uppercase letter
•	At least one special character (!@#$%^&*)
•	If valid, print "Strong Password"
•	If not, suggest a stronger password by:
•	Appending missing character types using StringBuilder

Example Input:
welcome1

Example Output:
Weak Password. Suggested: welcome1A!
 */
    import java.util.Scanner;

    public class PasswordStrengthCheck
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input from user
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Check conditions
            boolean hasDigit = false;
            boolean hasUpper = false;
            boolean hasSpecial = false;
            boolean hasLength = password.length() >= 8;

            // Check each character
            for (char ch : password.toCharArray())
            {
                if (Character.isDigit(ch)) hasDigit = true;
                else if (Character.isUpperCase(ch)) hasUpper = true;
                else if ("!@#$%^&*".indexOf(ch) >= 0) hasSpecial = true;
            }

            // If all conditions met
            if (hasDigit && hasUpper && hasSpecial && hasLength)
            {
                System.out.println("Strong Password");
            } else
            {
                // Create suggestion
                StringBuilder sb = new StringBuilder(password);
                if (!hasUpper) sb.append('A');           // Add uppercase if missing
                if (!hasSpecial) sb.append('!');          // Add special char if missing
                if (!hasDigit) sb.append('1');            // Add digit if missing
                while (sb.length() < 8) sb.append('x');   // Pad if length < 8

                System.out.println("Weak Password. Suggested: " + sb.toString());
            }

            scanner.close();
        }
    }