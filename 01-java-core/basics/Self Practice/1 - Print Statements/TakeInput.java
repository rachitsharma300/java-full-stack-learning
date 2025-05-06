//2. Take name input from the user and print "Hello, [Name]"


import java.util.Scanner;

public class TakeInput
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String name = scan.nextLine();

        System.out.println("Your Name is " + name);
        scan.close();
    }
}
