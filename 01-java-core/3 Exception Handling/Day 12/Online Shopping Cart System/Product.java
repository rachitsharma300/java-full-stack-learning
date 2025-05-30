import java.util.*;
class Product
{
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category)
    {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Getter
    public String getName()
    {return name; }
    public double getPrice()
    {return price; }
    public String getCategory()
    {return category; }

    // Equals & hashCode based on name to use HashMap
    @Override
    public boolean equals(Object o)
    {
        if (this == o )
            return true;
        if (!(o instanceof  Product))
            return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    public int hashCode()
    {
        return Objects.hash(name);
    }
}
