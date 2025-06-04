// Write a program to demonstrate constructor overloading

public class ConstructorOverloading
{
    //Properties
    String name;
    int age;
    String course;


    // Default constructor
    ConstructorOverloading()
    {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not Assigned";
    }

    // Constructor with one parameter
    ConstructorOverloading(String name)
    {
        this.name = name;
        this.age = 18;  // default age
        this.course = "Undeclared";
    }

    // Constructor with two parameters
    ConstructorOverloading(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.course = "Undeclared";
    }

    // Constructor with all parameters
    ConstructorOverloading(String name, int age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student info
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading();                                                  // Default constructor
        ConstructorOverloading s2 = new ConstructorOverloading("Komal");                                     // One parameter
        ConstructorOverloading s3 = new ConstructorOverloading("Kajal", 21);                            // Two parameters
        ConstructorOverloading s4 = new ConstructorOverloading("Rachit", 22, "Java Full Stack");  // All parameters
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}