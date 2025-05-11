/*
Write a java program on below questions[OOP's].
1.1 Create a class Person with properties (name and age) with following features.
a. Default age of person should be 18.
b. A person object can be initialized with name and age.
c. Method to display name and age of person.
 */
class Person
{
    // Properties of Person class
    String name;
    int age;

    // Constructor when only name is provided default age = 18
    Person(String name)
    {
        this.name = name;
        this.age = 18;   // Default age
    }

    // Constructor both are provided
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to run the Person class
public class PersonWithProperties
{
    public static void main(String[] args)
    {
        // Creating person object with only name
        Person person1 = new Person("Rachit");

        // Creating person object with name and custom age
        Person person2 = new Person("Aarav", 25);

        // Display info of both persons
        System.out.println("Person 1 Details:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Details:");
        person2.displayInfo();
    }
}
// Expected Output:
/*
Person 1 Details:
Name: Rachit
Age: 18

Person 2 Details:
Name: Aarav
Age: 25
*/