// Use Java Streams to group a list of objects by a property using Collectors.groupingBy()

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Gadget
{
    String name;
    String brand;

    public Gadget(String name, String brand)
    {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return name;
    }
}

public class GroupByExample
{
    public static void main(String[] args)
    {
        List<Gadget> gadgets = Arrays.asList(
                new Gadget("iPhone 16", "Apple"),
                new Gadget("Galaxy S25", "Samsung"),
                new Gadget("iPad M4", "Apple"),
                new Gadget("Pixel 12", "Google"),
                new Gadget("Galaxy Tab", "Samsung"),
                new Gadget("Pixel Watch", "Google")
        );

        // Group by brand
        Map<String, List<Gadget>> groupByBrand = gadgets.stream()
                .collect(Collectors.groupingBy(g -> g.brand));

        // Print results
        groupByBrand.forEach((brand, items) ->
        System.out.println(brand + " => " + items)
        );
    }
}
