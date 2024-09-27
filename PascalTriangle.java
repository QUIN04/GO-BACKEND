public class PascalTriangle {
    public static void Pascal(int n)
    {
        for (int row = 1; row <= n; row++) {
            for (int j = 0; j <= n - row; j++) {

                System.out.print(" ");  
            }

            int prime = 1;
            for (int i = 1; i <= row; i++) {
 
                System.out.print(prime + " ");
                prime = prime * (row - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n = 5;
        Pascal(n);
    }
    

}
