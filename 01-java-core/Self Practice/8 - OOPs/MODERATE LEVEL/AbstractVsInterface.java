//  Compare abstract class and interface with an example.

abstract class Payment
{
    String payerName;

    Payment(String payerName)
    {
        this.payerName = payerName;
    }

    void confirm()
    {
        System.out.println("Payment confirmed for: " + payerName);
    }
    abstract void pay(double amount);
}

// Interface
interface Discountable
{
    double getDiscount();
}

// Subclass implementing both
class OnlinePayment extends Payment implements Discountable
{
    OnlinePayment(String payerName)
    {
        super(payerName);
    }
    @Override
    void pay(double amount)
    {
        System.out.println("Paid: Rs." + amount + " Using Online Payment");
    }
    @Override
    public double getDiscount()
    {
        return 10.0;
    }
}
public class AbstractVsInterface
{
    public static void main(String[] args)
    {
        OnlinePayment op = new OnlinePayment("Rachit");
        op.confirm(); // inherited form abstract class
        op.pay(500);
        System.out.println("Discount: " + op.getDiscount() + "%");
    }
}
