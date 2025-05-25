/*
Q 2. Create a class Voter(voterId, name, age) with parameterized constructor. The parameterized constructor should throw
a checked/Unchecked exception if age is less than 18. The message of exception is "invalid age for voter "
*/



// Custom Unchecked Exception (Optional but Clean)
class InvalidVoterAgeException extends RuntimeException
{
    public InvalidVoterAgeException(String message)
    {
        super(message);
    }
}

// Voter class with parameterized constructor
class Voter
{
    private int voterId;
    private String name;
    private int age;

    // Constructor with age validation
    public Voter(int voterId, String name, int age)
    {
        if (age < 18)
        {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void displayInfo()
    {
        System.out.println("Voter ID : " + voterId);
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
    }
}

// Main class to test logic
public class VoterTest
{
    public static void main(String[] args)
    {
        try
        {
            Voter v1 = new Voter(101, "Rachit", 20);
            v1.displayInfo();
        }
        catch (InvalidVoterAgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        try
        {
            // This will throw exception
            Voter v2 = new Voter(102, "Kajal", 16);
            v2.displayInfo();
        }
        catch (InvalidVoterAgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
/*
|__________________________________________|
|               OUTPUT                     |
|------------------------------------------|
|       Voter ID : 101                     |
|       Name     : Rachit                  |
|       Age      : 20                      |
|                                          |
|       Exception: invalid age for voter   |
|                                          |
|------------------------------------------|
*/