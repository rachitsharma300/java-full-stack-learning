public class MissingNO
{
    public static void main(String[] args) 
    {
        int sum1 = 0;
        int [] arr = {1, 2, 4, 5,};

        for(int i=0; i<arr.length; i++)
        {
            sum1=sum1+arr[i];
        }
        System.out.println("Sum of element in array.." + sum1);
        int sum2=0;
        for(int i =1; i<=5; i++)
        {
            sum2=sum2+i;
        }
        System.out.println("sum of range of elements iin array. " + sum2);
        System.out.println(sum2-sum1 + "...Is missing No ");
    }
}