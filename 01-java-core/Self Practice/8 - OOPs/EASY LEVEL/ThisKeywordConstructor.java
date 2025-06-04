// Demonstrate use of this keyword in constructor and method.

public class ThisKeywordConstructor
{
    String name;
    int age;

    // Constructor using this to resolve variable name conflicts
    ThisKeywordConstructor(String name, int age)
    {
        this.name = name; // this.name -> instance variable
        this.age = age;  // name,age on right -> constructor parameters
    }

    // Methods using this to call another method
    void showDetails()
    {
        System.out.println("Student Name -> " + this.name);
        System.out.println("Student Age -> " + this.age);

        // Using this to call another method is same object
        this.greet();
    }

    void greet()
    {
        System.out.println("Hello, " + this.name + " Welcome to the JFSD_C.");
    }

    public static void main(String[] args)
    {
        ThisKeywordConstructor thc = new ThisKeywordConstructor("Rachit", 24);

        thc.showDetails();
    }
}
