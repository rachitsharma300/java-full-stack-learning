// Compare two Strings


public class CompareTwoString
{
    public static void main(String[] args)
    {
        String str1 = "Rachit";
        String str2 = "Rachit";
        String str3 = "rachit";

        // Using equals()
        if (str1.equals(str2))
        {
            System.out.println("str1 and str2 are equal (equals)");
        }
        else
        {
            System.out.println("str1 and str2 are NOT equal (equals)");
        }

        // Using equalsIgnoreCase()
        if (str1.equalsIgnoreCase(str3))
        {
            System.out.println("str1 and str3 are equal (equalsIgnoreCase)");
        }
        else
        {
            System.out.println("str1 and str3 are NOT equal (equalsIgnoreCase)");
        }

        // Using compareTo()
        int result = str1.compareTo(str3);
        if (result == 0)
        {
            System.out.println("str1 and str3 are equal (compareTo)");
        }
        else if (result > 0)
        {
            System.out.println("str1 is greater than str3 (compareTo)");
        }
        else
        {
            System.out.println("str1 is smaller than str3 (compareTo)");
        }
    }
}
