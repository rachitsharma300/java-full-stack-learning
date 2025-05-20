// Electronics class implementing both Product and Discountable
public class Electronics implements Product, Discountable {
    private String name;
    private double price;

    public Electronics(String name, double price) {
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
