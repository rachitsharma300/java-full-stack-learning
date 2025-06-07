// Implement a Factory Pattern using an interface and an abstract class to create objects of different PaymentMethod
// types such as CreditCard, UPI, and NetBanking.

// 1. PaymentMethod Interface
interface PaymentMethod
{
    void pay(double amount);
}

// 2. Concrete Classes
class CreditCard implements PaymentMethod
{
    public void pay(double amount)
    {
        System.out.println("Paid: " + amount + " using Credit Card.");
    }
}

class UPI implements PaymentMethod
{
    public void pay(double amount)
    {
        System.out.println("Paid: " + amount + " using UPI.");
    }
}

class NetBanking implements PaymentMethod
{
    public void pay(double amount)
    {
        System.out.println("Paid: " + amount + " using Net Banking.");
    }
}

// 3. Abstract Factory
abstract class PaymentFactory
{
    abstract PaymentMethod getPaymentMethod(String method);
}

// 4. Concrete Factory
class ConcretePaymentFactory extends PaymentFactory
{
    @Override
    PaymentMethod getPaymentMethod(String method)
    {
        if (method == null) return null;

        switch (method.toLowerCase())
        {
            case "creditcard": return new CreditCard();
            case "upi": return new UPI();
            case "netbanking": return new NetBanking();
            default: return null;
        }
    }
}
// 5. Client class
public class PaymentFactoryDemo {
    public static void main(String[] args) {
        PaymentFactory factory = new ConcretePaymentFactory();

        PaymentMethod p1 = factory.getPaymentMethod("creditcard");
        PaymentMethod p2 = factory.getPaymentMethod("upi");
        PaymentMethod p3 = factory.getPaymentMethod("netbanking");

        p1.pay(1500);
        p2.pay(500);
        p3.pay(1200);
    }
}
