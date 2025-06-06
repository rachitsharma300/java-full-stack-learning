// Demonstrate Has-A relationship (Composition) using a Library and Book class.

class  Address
{
    String city;
    String state;
    String country;

    // Constructor
    Address(String city,String state, String country)
    {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void displayAddress()
    {
        System.out.println(city + ", " + state + ", " + country);
    }
}

// Company class (Has-A Address)
class Company
{
    String name;
    Address address; // HAs-A relationship

    // Constructor
    Company(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }

    void displayCompanyInfo()
    {
        System.out.println("Company Name: " + name);
        System.out.println("Location: ");
        address.displayAddress();  // using contained object
    }
}

public class CompositionDemo
{
    public static void main(String[] args)
    {
        Address addr = new Address("Nalanda", "Bihar", "India");
        Company comp = new Company("HCL TECH Pvt Ltd", addr);

        comp.displayCompanyInfo();
    }
}