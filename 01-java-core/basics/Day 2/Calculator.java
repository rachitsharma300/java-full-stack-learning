import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number");
        double num1 = scan.nextDouble();
        System.out.println("Enter Second Number");
        double num2 = scan.nextDouble();

        System.out.println(" Select + - * / % ");
        char operator = scan.next().charAt(0);
        double result;

        switch (operator)
        {
            case '+':
                result = num1 + num2;
                System.out.println("Number 1 + Number 2 = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Number 1 - Number 2 = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Number 1 * Number 2 = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Number 1 % Number 2 = " + result);
                break;
            case '/':
                if (num2 != 0)
                {
                    result = num1 / num2;
                    System.out.println("Number 1 / Number 2 =" + result);
                }
                else
                {
                    System.out.println("0 is Not Divisible");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
        scan.close();
    }
}
