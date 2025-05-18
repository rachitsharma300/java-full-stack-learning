/*
2.Create Interface Taxable with members sales Tax=7% and income Tax=10.5%. create abstract method calcTax().

a. Create class Employee(empId, name, salary) and implement Taxable to calculate income Tax on yearly salary.

b. Create class Product(pid,price, quantity) and implement Taxable to calculate sales Tax on unit price of product.

c. Create class for main method(Say DriverMain), accept employee information and a product information from user and
print income tax and sales tax respectively
 */

import java.util.Scanner;

// Main class to test Employee and Product tax calculations
public class OriginMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // ----- Employee Input -----
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Monthly Salary (₹): ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empId, name, salary);
        emp.calcTax();

        // ----- Product Input -----
        System.out.print("\nEnter Product ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Product Price (₹): ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product prod = new Product(pid, price, qty);
        prod.calcTax();

        sc.close();
    }
}
