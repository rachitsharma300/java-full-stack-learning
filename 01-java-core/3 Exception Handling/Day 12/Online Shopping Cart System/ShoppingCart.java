import java.util.HashMap;
import java.util.Map;
class ShoppingCart
{
    // Store Products and its Quality

    private Map<Product, Integer> cart = new HashMap<>();
    private double discountPercent = 0;

    public void addProduct(Product product)
    {
        cart.put(product, cart.getOrDefault(product, 0) + 1);
        System.out.println("Product added to Cart :" + product.getName());
    }

    public void removeProduct(Product product)
    {
        if (cart.containsKey(product))
        {
            int quantity = cart.get(product);
            if (quantity == 1)
            {
                cart.remove(product);
            }
            else
            {
                cart.put(product, quantity - 1);
            }
            System.out.println("Product removed from cart: " + product.getName());
        }
        else
        {
            System.out.println("Product not found in Cart: " + product.getName());
        }
    }

    public void applyDiscount(double discountPercent)
    {
        this.discountPercent = discountPercent;
        double total = calculateTotalPrice();
        double discountedTotal = total * (1 - discountPercent / 100);
        System.out.printf("Applying discount of %.0f%%. Total price: %, .0f%n", discountPercent, discountedTotal);
    }

    private double calculateTotalPrice()
    {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cart.entrySet())
        {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public void viewCart()
    {
        System.out.println("Shopping Cart :");
        for (Map.Entry<Product, Integer> entry : cart.entrySet())
        {
            Product product = entry.getKey();
            int qty = entry.getValue();
            System.out.printf("%s: %d x %, .0f%n", product.getName(), qty, product.getPrice());
        }
        double total = calculateTotalPrice();
        double discountedTotal = total * ( 1 - discountPercent / 100);
        System.out.printf("Total: %, .0f%n", discountedTotal);
    }
}
