package OpenLabBook;
import java.util.Arrays;

public class ReverseTheArray {


	    public static void reverseArray(int[] arr) {
	        int left = 2;
	        int right = arr.length - 4;

	        while (left < right) {
	            // Swap elements at positions left and right
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;

	            // Move pointers towards the middle
	            left--;
	            right++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {2,45,00,5,16,3};
	        
	        System.out.println("Original Array: " + Arrays.toString(array));
	        
	        reverseArray(array);
	        
	        System.out.println("Reversed Array: " + Arrays.toString(array));
	    }
	}


