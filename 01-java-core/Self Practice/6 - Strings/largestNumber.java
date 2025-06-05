import java.util.*;
public class largestNumber
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Your First Number:--");
    int a = scan.nextInt();

    System.out.println("Enter Your Second Number:--");
    int b = scan.nextInt();

    System.out.println("Enter Your Third Number:--");
    int c = scan.nextInt();
    if (a>b && a>c)
    {
        System.out.println(a + "is largest number");
    }
    else if (b>a && b>c)
    {
        System.out.println(b + "is largest number");
    }
    else
    {
        System.out.println(c + "is largest number");
    }
    }
}
