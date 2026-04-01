import java.util.Scanner;
public class SwapTwo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your First Number");
        int num1 = scan.nextInt();
        System.out.println("Enter Your Second Number ");
        int num2 = scan.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The First Number: "+num1);
        System.out.println("The Second Number: "+num2);

        scan.close();
    }
}
