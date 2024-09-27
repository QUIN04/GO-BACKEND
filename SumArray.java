public class SumArray {
     
     static int arr[]  = {2,4,6,7,9};

     static int sum(){
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++)
            sum += arr[i];
            return sum;
        }
     
    public static void main(String[] args){
       
 System.out.println("Sum = " + sum());
    }
}
