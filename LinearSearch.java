public class LinearSearch {

	static int search(int arr[], int n, int x) 
	{ 
		for (int i = 0; i < n; i++) { 
			
			if (arr[i] == x) 
				return i; 
		} 

		 
		return -1; 
	} 

	public static void main(String[] args) 
	{ 
		int[] arr = { 1, 2, 3, 4, 5 }; 
		int n = arr.length; 
		
		int x = 4; 

		int index = search(arr, n, x); 
		if (index == -1) 
			System.out.println("Element is not in the array"); 
		else
			System.out.println("Element found at " + index); 
	} 
} 

