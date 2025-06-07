// Create a project-like class structure where UserAccount is the base class, and PremiumUser and AdminUser are subclasses.
// Each class should override the calculateBonus()

class UsersAccount
{
    String username;

    UsersAccount(String username)
    {
        this.username = username;
    }

    void calculateBonus()
    {
        System.out.println(username + " gets a standard 5% bonus.");
    }
}

// Premium user class
class PremiumUsers extends UsersAccount {
    PremiumUsers(String username) {
        super(username);
    }

    @Override
    void calculateBonus()
    {
        System.out.println(username + " gets a premium 20% bonus!");
    }
}

// Admin User class
class AdminUser extends UsersAccount
{
    AdminUser(String username)
    {
        super(username);
    }
    @Override
    void calculateBonus()
    {
        System.out.println(username + " (Admin) gets a fixed 1000 Bonus.");
    }
}

public class BonusSystem
{
    public static void main(String[] args)
    {
        UsersAccount user = new UsersAccount("Kajal");
        UsersAccount Premium = new PremiumUsers("Rahul");
        UsersAccount admin = new AdminUser("Rachit");

        user.calculateBonus();
        Premium.calculateBonus();
        admin.calculateBonus();
    }
}