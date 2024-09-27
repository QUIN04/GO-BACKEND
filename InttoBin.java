// import java.io.*;
import java.util.Stack;

public class InttoBin {
     static void decitoBin(int num){
        Stack<Integer> st  = new Stack<> ();

        while(num > 0){
             st.push(num % 2);
             num = num / 2;
           
        }
        while(!(st.isEmpty())){
              System.out.print(st.pop());
        }

}

public static void main(String[] args) {
    int num = 9;
    decitoBin(num);
}
             
    }

