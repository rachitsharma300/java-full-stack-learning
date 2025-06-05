public class swapTwoNoWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap--" + a+ " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap--"+ a +" "+ b);
    }
}
