// Convert to uppercase and lowercase


import java.util.Scanner;

public class ConvertUpperLower
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String only Uppercase");
        String inp = scan.nextLine();

        System.out.println("Lowercase" + inp.toLowerCase());

        scan.close();
    }
}
