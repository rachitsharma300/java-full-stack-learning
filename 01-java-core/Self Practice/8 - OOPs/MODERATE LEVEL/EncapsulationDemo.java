// Write a program to demonstrate encapsulation in a UserAccount class.

class UserAccount
{
    private String username;
    private String email;
    private double balance;

    // Getter and Setter for username
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        if (!username.isEmpty())
        {
            this.username = username;
        }
        else
        {
            System.out.println("Username can't br Empty");
        }
    }
    // Getter Setter for Email
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email = email;
        }
        else
        {
            System.out.println("Invalid Email format");
        }
    }
    // Getter Setter for Balance

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        if (balance >= 0)
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("Balance Can't be negative");
        }
    }
}

public class EncapsulationDemo
{
    public static void main(String[] args)
    {
        UserAccount acc = new UserAccount();

        //Setting data using setters
        acc.setUsername("RachitX");
        acc.setEmail("rachit@live.com");
        acc.setBalance(2000.50);

        // Getting data using getters
        System.out.println("Username: " + acc.getUsername());
        System.out.println("Email: " + acc.getEmail());
        System.out.println("Balance: " + acc.getBalance());
    }
}