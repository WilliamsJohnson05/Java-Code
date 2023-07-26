package CloseLabBook;
import java.util.Arrays;

public class ReverseElementInArray {
	

	    public static void main(String[] args) {
	        int[] arr = {55,45,43,05,23,16};
	        
	        System.out.println("Original Array: " + Arrays.toString(arr));
	        
	        reverseArray(arr);
	        
	        System.out.println("Reversed Array: " + Arrays.toString(arr));
	    }
	    
	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        
	        while (start < end) {
	            // Swap the elements at start and end positions
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            
	            // Move the pointers towards each other
	            start++;
	            end--;
	        }
	    }
	}


