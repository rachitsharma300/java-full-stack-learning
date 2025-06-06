// Demonstrate runtime polymorphism using method overriding

class Notification
{
    void send()
    {
        System.out.println("Sending a Notification");
    }
}

// Child class 1
class EmailNotification extends Notification
{
    @Override
    void send()
    {
        System.out.println("Sending Notification via Email..");
    }
}

// Child class 2
class SMSNotification extends Notification
{
    @Override
    void send()
    {
        System.out.println("Sending Notification via SMS...");
    }
}

public class PolymorphismExample
{
    public static void main(String[] args) {
        EmailNotification en = new EmailNotification();
        en.send();

        SMSNotification sn = new SMSNotification();
        sn.send();



//  Simple Method...

//        Notification n;
//        n = new EmailNotification();
//        n.send();
//
//        n = new SMSNotification();
//        n.send();

    }
}
