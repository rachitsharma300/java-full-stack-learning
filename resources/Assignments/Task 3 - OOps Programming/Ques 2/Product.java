// Class to represent a Product and calculate sales tax on unit price
class Product implements Taxable
{
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity)
    {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    // Implementation of calcTax for product's unit price
    public void calcTax()
    {
        double tax = price * salesTax;
        System.out.println("\nSales Tax on Product (Unit Price ₹" + price + "): ₹" + String.format("%.2f", tax));
    }
}
