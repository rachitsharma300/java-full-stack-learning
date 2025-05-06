//9. Take two strings and print them combined


import java.util.Scanner;

public class StringCombine
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Name : ");
        String f1 = scan.nextLine();

        System.out.println("Enter Last Name : ");
        String l1 = scan.nextLine();

//        With Inbuild Library
//        String fullName = f1.concat(l1);
//        System.out.println(" " + fullName);

//        Without Library
//        String fullName = f1 + l1;
//        System.out.println(fullName);

        System.out.println(f1 + " " + l1);

        scan.close();
    }
}
