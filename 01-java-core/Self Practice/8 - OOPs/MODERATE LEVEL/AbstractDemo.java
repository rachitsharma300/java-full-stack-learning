// Implement an abstract class Shape with abstract method area(). Extend it in Circle and Square.

// Abstract class
abstract class MyShape
{
    // Abstract method -- No Body
    abstract void area();
}
// Circle class
class Circle extends MyShape
{
    double radius;

    // Constructor
    Circle(double radius)
    {
        this.radius = radius;
    }

    // Override area method
    @Override
    void area()
    {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Square class
class Square extends MyShape
{
    double side;

    // Constructor
    Square(double side)
    {
        this.side = side;
    }

    // Override area method
    @Override
    void area()
    {
        double result = side * side;
        System.out.println("Area of Square: " + result);
    }
}

public class AbstractDemo
{
    public static void main(String[] args)
    {
        MyShape c = new Circle(5.0);
        c.area();
        System.out.println("-----------------------");
        System.out.println("Code Compilation is in Process");

        MyShape s = new Square(4.0);
        s.area();
        System.out.println("Time Complexity O(log n) ");
    }
}