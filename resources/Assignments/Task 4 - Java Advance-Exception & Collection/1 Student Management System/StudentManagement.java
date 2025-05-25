/*
Q-1. Ramesh is developing a student management system for a university. In this system, you have a Student class to
represent student information. You are asked to help Ramesh to handle exception which can be occurred into program
according to following Scenarios:

- class Student with attributes roll no, name, age and course. Initialize values through parameterized constructors.
- If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException".
- If a name contains numbers or special symbols, raise exception "NameNotValidException". Define the two exception classes.
*/

//Custom exception for age not within the valid range
class AgeNotWithinRangeException extends Exception
{
    public AgeNotWithinRangeException(String message)
    {
        super(message);
    }
}

// Custom exception for invalid names - with digits / special characters.
class NameNotValidException extends Exception
{
    public NameNotValidException(String message)
    {
        super(message);
    }
}

//Student class with validation in constructor
class Student
{
    private int rollNo;
    private String name;
    private int age;
    private String courses;

    //Constructors with parameters
    public Student(int rollNo, String name, int age, String courses)
        throws AgeNotWithinRangeException, NameNotValidException
    {
        // Roll and course directly assigned
        this.rollNo = rollNo;
        this.courses = courses;

        //validate age
        if (age < 15 || age > 21)
        {
            throw new AgeNotWithinRangeException("Age must between 15 and 21. ");
        }
        this.age = age;

        //Validate name (Not allowed digits or Special Characters )
        if (!name.matches("[a-zA-Z\\s]+"))
        {
            throw new NameNotValidException("Name must contain only Alphabets and spaces");
        }
        this.name = name;
    }
    //Method to Display Student Details
    public void displayStudent()
    {
        System.out.println("Student Details : ");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name :  " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + courses);
    }
}

//Main class to test exception handling
public class StudentManagement
{
    public static void main(String[] args)
    {
        try {
            Student s1 = new Student(100, "Rachit Sharma", 19, "B.tech");
            s1.displayStudent();
        }
        catch (AgeNotWithinRangeException e)
        {
            System.out.println("Age Error! " + e.getMessage());
        }
        catch (NameNotValidException e)
        {
            System.out.println("Name Error! " + e.getMessage());
        }

        System.out.println(); // For Spacing

        try
        {
            // Invalid name (Contains digits)
            Student s2 = new Student(101, "Kajal123", 18, "BBM");
            s2.displayStudent();
        }
        catch (AgeNotWithinRangeException e)
        {
            System.out.println("Age Error ! " + e.getMessage());
        }
        catch (NameNotValidException e)
        {
            System.out.println("Name Error ! " + e.getMessage());
        }

        System.out.println();

        try
        {
            // Invalid age - below 15.
            Student s3 = new Student(102, "Rohan", 14, "BBA");
            s3.displayStudent();
        }
        catch (AgeNotWithinRangeException e)
        {
            System.out.println("Age Error ! " + e.getMessage());
        }
        catch (NameNotValidException e)
        {
            System.out.println("Name Error ! " + e.getMessage());
        }
    }
}

/*
|-----------------------------------------------------------|
|                      OUTPUT                               |
|-----------------------------------------------------------|
|Student Details :                                          |
|Roll No : 100                                              |
|Name    : Rachit Sharma                                    |
|Age     : 19                                               |
|Course  : B.tech                                           |
|Name Error ! Name must contain only Alphabets and spaces   |
|                                                           |
|Age Error ! Age must between 15 and 21.                    |
|-----------------------------------------------------------|
*/