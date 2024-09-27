public class SwapNumbers {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        System.out.println("Before Swap:");
        System.out.println("a=" + a );
        System.out.println("b=" +  b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("a=" + a );
        System.out.println("b=" +  b);


    }
}
