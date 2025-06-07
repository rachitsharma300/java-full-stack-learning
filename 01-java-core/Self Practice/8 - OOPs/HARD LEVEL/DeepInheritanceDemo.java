// Write a program with deep inheritance (3+ levels) and method overriding at each level

class Notifications
{
    void send()
    {
        System.out.println("Sending a generic Notifications...");
    }
}

// Level 1: Email Notification
class EmailNotifications extends Notifications
{
    @Override
    void send()
    {
        System.out.println("Sending an email notification...");
    }
}

// Level 2: Promotional Email
class PromotionalEmail extends EmailNotifications
{
    @Override
    void send()
    {
        System.out.println("Sending a promotional email...");
    }
}

// Level 3: Offer Email
class OfferEmail extends PromotionalEmail
{
    @Override
    void send()
    {
        System.out.println("Sending an exclusive offer email !");
    }
}

public class DeepInheritanceDemo
{
    public static void main(String[] args)
    {
        Notifications base = new EmailNotifications();
        Notifications email = new EmailNotifications();
        Notifications promo = new PromotionalEmail();
        Notifications offer = new OfferEmail();

        base.send();
        email.send();
        promo.send();
        offer.send();
    }
}