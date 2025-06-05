public class LinerSearch 
{
    public static void main(String[] args) 
    {
        int [] num = {10, 20, 30, 40, 50};
        boolean flag = false;

        int My_searchNo =40;

        for(int i=0; i<num.length; i++)
        {
            if(My_searchNo == num[i])
            {
                System.out.println("Element Found In index no:" + i);
                flag = true;
            }
        }
        if(flag == false)
        {
            System.out.println("Element not found");
        }


        
    }
    
}
