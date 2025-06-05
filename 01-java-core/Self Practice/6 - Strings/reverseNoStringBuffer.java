public class reverseNoStringBuffer {
    public static void main(String[] args) {
        int num = 12345;
        

        StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer revBuffer= sb.reverse();
        System.out.println("Reverse Number is:--"+ revBuffer);
    }
    
}
