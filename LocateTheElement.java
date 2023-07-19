package javaLabCard1;
import java.util.Scanner;

public class LocateTheElement {

	    public static int findElementIndex(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i;
	            }
	        }
	        return-1;
	        }
	    

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the Number of Elements in the Array: ");
	        int n = scan.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the " + n + " elements:");

	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }

	        System.out.print("Enter the element you want to find: ");
	        int target = scan.nextInt();

	        scan.close();

	        int index = findElementIndex(arr, target);

	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	        
	}

}
