// Create a simple inheritance example with class Person and Employee

class Person {
    String name;
    int age;

    // Constructor for Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to Display Person Info
    void displayPersonInfo() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}

    // Derived Class (Child) Extends Person
    class Employee extends Person
    {
        String jobTitle;
        double salary;


// Constructor for Employee using super()

    Employee(String name, int age, String jobTitle, double salary) {
        super(name, age); // call Parent Constructor
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void displayEmployeeInfo() {
        displayPersonInfo(); // Calling parent method
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args)
    {
        Employee emp = new Employee("Rachit", 24, "Java Developer", 50000);
        emp.displayEmployeeInfo();
    }
}