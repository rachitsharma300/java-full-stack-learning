// Main class to test the ecommerce system
public class ECommerceMain
{
    public static void main(String[] args)
    {
        Product p1 = new Electronics("Laptop", 60000);
        Discountable d1 = (Discountable) p1;
        System.out.println(p1.getName() + ": " + d1.applyDiscount(10));

//        Product p2 = new Clothing("Shirt", 1500);
//        Discountable d2 = (Discountable) p2;
//        System.out.println(p2.getName() + ": " + d2.applyDiscount(20));
//
//        Product p3 = new Grocery("Rice Bag", 1200);
//        Discountable d3 = (Discountable) p3;
//        System.out.println(p3.getName() + ": " + d3.applyDiscount(5));
    }
}
