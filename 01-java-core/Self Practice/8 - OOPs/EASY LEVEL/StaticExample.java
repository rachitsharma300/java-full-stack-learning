// Create a class with static variable and method. Access it without creating an object

public class StaticExample {
    // Static Variable
    static String course = "Java Full Stack Development";

    // Static Method
    static void displayCourse()
    {
        System.out.println("Course Name: " + course);
    }

    public static void main(String[] args)
    {
        // Accessing static variable and method without creating object
        System.out.println("Accessing static variable: " + StaticExample.course);
        StaticExample.displayCourse();
    }
}
