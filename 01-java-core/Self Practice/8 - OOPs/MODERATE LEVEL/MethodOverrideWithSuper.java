// Write a program that overrides a method in child class and accesses parent method using super

class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        // Calling Parent class method using super
        super.sound(); // this calls Animal sound()
        System.out.println("Dog --> Bhw Bhw");
    }
}

class Cat extends Animal
{
    @Override
    void sound()
    {
        super.sound();
        System.out.println("Cat --> Meow Meow");
    }
}

public class MethodOverrideWithSuper
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.sound(); // Calls Dog's overridden method

        Cat c = new Cat();
        c.sound();
    }
}
