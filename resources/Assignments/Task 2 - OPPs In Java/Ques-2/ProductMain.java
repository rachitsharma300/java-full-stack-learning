/*
Create class Product(pid,Price,quantity) with parameterized constructor.
Create a main function in different class (say ProductMain) and perform following task:

a. Accept fine product inforamtion from user and store in an array.
b. Find Pid of the product with the highest price.
c. Create method(with array of product's object as argument) in ProductMain class
to calculated and return the total amount spent on all products. (amount spent on
single product=price * quantity of product.
 */
import java.util.Scanner;

public class ProductMain {

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Product[] products = new Product[5]; // Array to store 5 products

        // Accepting 5 product details from user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int pid = scan.nextInt();
            System.out.print("Enter Price: ");
            double price = scan.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scan.nextInt();

            // Creating and storing the product object in array
            products[i] = new Product(pid, price, quantity);
        }

        // Finding the Product ID with highest price
        double maxPrice = products[0].price;
        int maxPricePid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPricePid = products[i].pid;
            }
        }
        // Displaying result
        System.out.println("\nProduct ID with the highest price: " + maxPricePid);

        // Calculating and displaying total amount spent
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scan.close();
    }
}

// Expected Output:
/*
Enter details for Product 1
Enter Product ID: 101
Enter Price: 20.5
Enter Quantity: 2
.................
Enter details for Product 5
Enter Product ID: 105
Enter Price: 99.9
Enter Quantity: 1

Product ID with the highest price: 105
Total amount spent on all products: 355.3
*/

