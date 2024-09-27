public class LargestElemArray {
    
    static int arr[] = {7, 2, 5, 1, 4};

    static int largest(){
        int i;
        int max = arr[0];

        for(i = 1; i < arr.length ; i++)
        if (arr[i] > max)
        
        max = arr[i];

        return max;
    }

    public static void main(String[] args){
System.out.println("Largest in an array:" + largest());
}
}