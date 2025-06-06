// Override toString() method of Object class.

class StudentInfo
{
    String name;
    int age;
    double percentage;

    // Constructor
    StudentInfo(String name, int age, double percentage)
    {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    //Overriding toString() Method
    @Override
    public String toString()
    {
        return "Student Info: [Name: " + name + ", Age: " + age + ", Percentage: " + percentage + "%]";
    }
}
public class OverridingToString
{
    public static void main(String[] args)
    {
        StudentInfo si = new StudentInfo("Rachit", 24, 77.8);
        System.out.println(si);
    }
}

