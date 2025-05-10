// Use Scanner Class to take input form user--

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String str = scan.nextLine();

        System.out.println("You are : " + str);

    }
}
