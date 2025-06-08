/*
Array Index Out of Bounds
Create an array and access an invalid index. Handle the exception properly.
*/

public class ArrayIndexOutOfBound
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        try
        {
            System.out.println("Elements at Index 10: " + numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: \nIndex out of bounds " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
