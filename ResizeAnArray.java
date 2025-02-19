package CloseLabBook;
import java.util.Arrays;

public class ResizeAnArray {
	
 public static void main(String[] args) {
	        int[] originalArray = {0,2,3,4,5,16,23,18,};
	        int newSize = 16;

	        int[] resizedArray = resizeArray(originalArray, newSize);

	        System.out.println("Resized Array: " + Arrays.toString(resizedArray));
	   }

	    public static int[] resizeArray(int[] arr, int newSize) {
	        int[] newArray = new int[newSize];

	        // Copy elements from the original array to the new array
	        
	        int length = Math.min(arr.length, newSize);
	        System.arraycopy(arr, 0, newArray, 0, length);

	        return newArray;
	    }
	}
