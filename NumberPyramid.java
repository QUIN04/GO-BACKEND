public class NumberPyramid {
    
    public static void main(String[] args){
        int row = 5;
        
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                System.out.print("");
            }
            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            for(int I = 2; I <= i; I++){
                System.out.print(I);
            }
            System.out.println();
        }
    }
}
