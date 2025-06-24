// Input your first name and last name separately,
// and print the full name in the format "Last, First"

import java.util.Scanner;

public class Ques_13_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you first name: ");
        String FirstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        String LastName = scan.nextLine();

        System.out.println(LastName + "," + FirstName);
        scan.close();
    }
}
