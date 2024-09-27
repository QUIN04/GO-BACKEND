public class MatrixTranspose {
    
 static final int n = 3;

 static void transpose(int A[][], int B[][]){
    int i,j;
    for(i = 0; i < n; i++)
    for(j = 0; j < n; j++)

    B[i][j] = A[j][i];
 }
public static void main(String[] args) {
int A[][] = {{ 1, 2, 3 }, 
    { 4, 5, 6 },
    {7, 8, 9 }};
   
    int B[][] = new int[n][n], i,j;

    transpose(A,B);
    System.out.print("Transpose: \n"  );

for(i = 0; i < n; i++){
    for(j = 0; j < n; j++)
    System.out.print(B[i][j] + "");
    System.out.print("\n" );
}
}
}
