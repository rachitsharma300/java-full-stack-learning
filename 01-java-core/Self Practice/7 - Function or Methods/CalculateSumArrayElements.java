// Function with array parameter (sum of elements)

public class CalculateSumArrayElements
{
    public static int sumOfArray(int[] arr)
    {
        int sum = 0;
        for (int num : arr)
        {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] numbers = {5, 10, 15, 20};
        int total = sumOfArray(numbers);
        System.out.println("Sum of Array Elements: " + total);
    }
}
