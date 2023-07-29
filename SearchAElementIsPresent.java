package CloseLabBook;
import java.util.Scanner;

public class SearchAElementIsPresent {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create an array
	        int[] arr = { 4, 6, 8, 4, 2, 9, 4, 5, 1, 4 };
	        
	        System.out.print("Enter the element to search: ");
	        int searchElement = scanner.nextInt();

	        int occurrences = 0;
	        int firstOccurrenceIndex = -1;

	        // Search for the element in the array
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == searchElement) {
	                occurrences++;
	                if (firstOccurrenceIndex == -1) {
	                    firstOccurrenceIndex = i;
	                }
	            }
	        }

	        if (occurrences > 0) {
	            System.out.println("The element " + searchElement + " is present.");
	            System.out.println("First occurrence found at index: " + firstOccurrenceIndex);
	            System.out.println("Total occurrences: " + occurrences);
	        } else {
	            System.out.println("The element " + searchElement + " is not present in the array.");
	        }

	        scanner.close();
	    }
	}


