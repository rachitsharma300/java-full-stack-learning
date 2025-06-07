// Create a program where you call superclass constructor using super() keyword

class AppUser
{
    String name;
    String role;

    // Constructor of superclass
    AppUser(String name, String role)
    {
        this.name = name;
        this.role = role;
        System.out.println("AppUser Constructor called -->");
    }
}
 // Subclass
class PremiumUser extends AppUser
 {
     int subscriptionMonths;

     // Constructor of subclass using super()
     PremiumUser(String name, String role, int subscriptionMonths)
     {
         super(name, role); // called parent constructor
         this.subscriptionMonths = subscriptionMonths;
         System.out.println("PremiumUser constructor called");
     }

     void showDetails()
     {
         System.out.println("Name: " + name);
         System.out.println("Role: " + role);
         System.out.println("Subscription: " + subscriptionMonths + " months");
     }
 }

 public class SuperConstructorDemo
 {
     public static void main(String[] args)
     {
         PremiumUser user = new PremiumUser("Rachit", "Premium", 6);

         user.showDetails();
     }
 }