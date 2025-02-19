package OOPS;
import java.util.Scanner;

class BinarySearch {
    // Returns index of x if it is present in arr[l..r], else return -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to search:");
        int searchElement = input.nextInt();
        BinarySearch ob = new BinarySearch(); // Creating an instance of the BinarySearch class
        int n = arr.length;
        int result = ob.binarySearch(arr, 0, n - 1, searchElement);
        if (result == -1)
            System.out.println("Element not present");
        else {
            System.out.println("Element found at index " + result);
        }
    }
}

	 
 
