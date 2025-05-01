import java.util.Scanner;

public class Electricity_Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select Connection type :-");
        System.out.println("1. Residential");
        System.out.println("2. Commercial");
        int type = scan.nextInt();

        System.out.println("Enter the number of Unit Consumed :");
        double unit = scan.nextDouble();
        double bill;

        if (unit <= 100)
        {
            bill = unit * 2;
        } else if (unit <= 300)
        {
            bill = (100 * 2) + ((unit - 100) * 3);
        } else if (unit <= 500)
        {
            bill = (100 * 2) + (200 * 3) + ((unit - 300) * 5);
        } else
        {
            bill = (100 * 2) + (200 * 3) + (200 * 5) + ((unit - 500) * 7);
        }
        switch (type)
        {
            case 1:
                System.out.println("Customer Type: Residential");
                break;
            case 2:
                bill = bill * 1.10;
                System.out.println("Customer Type: Commercial (10% extra charge applied)");
                break;
            default:
                System.out.println("Invalid customer type!");
                return;
        }
        System.out.println("Total Units Consumed: " + unit);
        System.out.println("Total Bill Amount: ₹" + bill);
    }
}
