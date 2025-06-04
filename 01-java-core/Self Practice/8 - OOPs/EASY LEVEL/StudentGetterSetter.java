// Create a class Student with private fields. Use getters and setters to access them.

public class StudentGetterSetter
{
    private String name;
    private int age;
    private double percentage;

    // Getter Method for Name
    public String getName()
    {
        return name;
    }

    //Setter Method for Name
    public void setName(String name)
    {
        this.name = name;
    }

    // Getter Method for age
    public int getAge()
    {
        return age;
    }

    // Setter Method for age
    public void setAge(int age)
    {
        if (age > 0)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Invalid Age !");
        }
    }

    // getter Method for Percentage
    public double getPercentage()
    {
        return percentage;
    }

    // Setter Method for Percentage
    public void setPercentage(double percentage)
    {
        if (percentage >= 0 && percentage <= 100)
        {
            this.percentage = percentage;
        }
        else
        {
            System.out.println("Invalid percentage !");
        }
    }

    // Main Method to test the class
    public static void main(String[] args)
    {
        StudentGetterSetter sgs = new StudentGetterSetter();

        // Using setters to set data
        sgs.setName("Rachit");
        sgs.setAge(24);
        sgs.setPercentage(77.79);

        // Using getters to access data
        System.out.println("Name " + sgs.getName());
        System.out.println("Age " + sgs.getAge());
        System.out.println("Percentage " + sgs.getPercentage());
    }
}
