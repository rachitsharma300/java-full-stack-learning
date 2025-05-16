/*
Print Utility (Method Overloading)
Problem Statement:
Create a class Printer with an overloaded print() method:
•	print(String text)
•	print(int number)
•	print(double number)
•	print(String text, int times) – prints text multiple times
Test each method with appropriate inputs.
Input:
Printer p = new Printer();
p.print("Hello");
p.print(100);
p.print(99.99);
p.print("Java", 3);

Output:
Hello
100
99.99
Java
Java
Java
*/

class Printer {

    // Overloaded method for String
    void print(String text)
    {
        System.out.println(text);
    }

    // Overloaded method for int
    void print(int number)
    {
        System.out.println(number);
    }

    // Overloaded method for double
    void print(double number)
    {
        System.out.println(number);
    }

    // Overloaded method to print text multiple times
    void print(String text, int times)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println(text);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args)
    {
        Printer p = new Printer();
        p.print("Hello");
        p.print(100);
        p.print(99.99);
        p.print("Java", 3);
    }
}

