// Clothing class implementing both Product and Discountable
public class Clothing implements Product, Discountable {
    private String name;
    private double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double applyDiscount(double percentage) {
        return price - (price * percentage / 100);
    }
}
