public class RemoveDup {

  public static int removeduplicates(int a[], int n)
  {
      if (n == 0 || n == 1) {
          return n;
      }

    
      int[] temp = new int[n];
      int j = 0;

      for (int i = 0; i < n - 1; i++) {
          if (a[i] != a[i + 1]) {
              temp[j++] = a[i];
          }
      }

     
      boolean check = true;
      for (int i = 0; i < j; i++) {
          if (temp[i] == a[n - 1]) {
              check = false;
              break;
          }
      }

      if (check == true) {

          temp[j++] = a[n - 1];
      }
 
      for (int i = 0; i < j; i++) {
          a[i] = temp[i];
      }

      return j;
  }
  public static void main(String[] args)
  {
      int a[] = {  1, 2, 2, 3, 3, 3, 4, 5  };
      int n = a.length;

      n = removeduplicates(a, n);

      
      for (int i = 0; i < n; i++)
          System.out.print(a[i] + " ");
  }
}