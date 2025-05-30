/*
Online Shopping Cart System
Objective:
Simulate an online shopping cart where customers can add products, apply discounts, and view cart details.
Requirements:
•	Create a Product class with attributes like name, price, and category.
•	Use a HashMap<String, Product> to store products by name (key is the product name and value is the product).
•	Create a ShoppingCart class that stores a list of products and uses a HashMap<Product, Integer> to store product quantities.
•	Implement methods to:
o	Add products to the cart.
o	Remove products from the cart.
o	Apply a discount on the entire cart (using a double to calculate total price after applying a percentage discount).
o	View all products in the cart with quantities and total price.
Sample Input:
ShoppingCart cart = new ShoppingCart();
cart.addProduct(new Product("Laptop", 60000, "Electronics"));
cart.addProduct(new Product("Shirt", 1500, "Clothing"));
cart.applyDiscount(10);
cart.viewCart();
Expected Output:
Product added to cart: Laptop
Product added to cart: Shirt
Applying discount of 10%. Total price: 67,650
Shopping Cart:
Laptop: 1 x 60,000
Shirt: 1 x 1,500
Total: 67,650
 */

public class CartRun
{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product laptop = new Product("laptop", 55000, "Electronics");
        Product Jacket = new Product("Jacket", 2000, "Clothing");

        cart.addProduct(laptop);
        cart.addProduct(Jacket);
        cart.applyDiscount(10);
        cart.viewCart();
    }
}
