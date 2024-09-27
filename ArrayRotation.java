public class ArrayRotation {


    static void rotation(){
        int  arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int i;

        for (i = 0; i < arr.length; i++)
        if (arr[i] == d)
        arr[i] =  arr[i + 2] ;
        
    }
   public static void main(String[] args) {
     System.out.println("Rotated Array:" );
   }
}
 