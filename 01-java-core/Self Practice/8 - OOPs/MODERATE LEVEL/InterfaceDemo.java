// Create an interface Eatable and implement it in two classes Fruit and Vegetable

interface Eatable
{
    // Abstract method
    void eat();
}

//Implement Eatable in fruit
class Fruit implements Eatable
{
    @Override
    public void eat()
    {
        System.out.println("Eating a juicy fruit...");
    }
}

//Implement Eatable in Vegetable
class Vegetable implements Eatable
{
    @Override
    public void eat()
    {
        System.out.println("Eating a healthy vegetable...");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args) {
        Eatable f = new Fruit();
        f.eat();

        Eatable v = new Vegetable();
        v.eat();
    }
}