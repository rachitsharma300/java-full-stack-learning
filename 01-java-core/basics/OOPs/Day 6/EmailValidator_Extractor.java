/*
Email Validator and Extractor (String)
Objective: Practice String methods like contains(), indexOf(), substring(), split(), endsWith().
Problem: Write a Java program that:
•	Accepts a comma-separated list of email addresses.
•	Validates each one:
•	Must contain @ and .
•	Must end with .com or .org
•	Extracts and prints the username and domain separately.
Example Input:
john.doe@gmail.com,invalidEmail,test@company.org

Example Output:
Valid: john.doe@gmail.com | Username: john.doe | Domain: gmail.com
Invalid: invalidEmail
Valid: test@company.org | Username: test | Domain: company.org
 */

import java.util.Scanner;

public class EmailValidator_Extractor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter comma-separated email addresses:");
        String input = scan.nextLine();

        String[] emails = input.split(",");

        for (String email : emails) {
            email = email.trim(); // Trim space

            if (email.contains("@") && email.contains(".") &&
                    (email.endsWith(".com") || email.endsWith(".org"))) {

                int atIndex = email.indexOf("@");

                // Check if @ is not at the beginning or end
                if (atIndex > 0 && atIndex < email.length() - 1) {
                    String username = email.substring(0, atIndex);
                    String domain = email.substring(atIndex + 1);

                    System.out.println("Valid: " + email + " | Username: " + username + " | Domain: " + domain);
                } else {
                    System.out.println("Invalid: " + email);
                }
            } else {
                System.out.println("Invalid: " + email);
            }
        }

        scan.close();
    }
}

