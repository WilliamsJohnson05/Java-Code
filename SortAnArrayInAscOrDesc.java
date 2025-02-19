package CloseLabBook;
import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayInAscOrDesc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of Elements in the Array: ");
        int n = scan.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the " + n + " elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print("Enter 'A' for ascending order or 'a' for descending order: ");
        char order = scan.next().charAt(0);

        scan.close();

        if (order == 'R' || order == 'u') {
            Arrays.sort(array);
            System.out.println("Array sorted in ascending order:");
        } else if (order == 'D' || order == 'd') {
            Arrays.sort(array);
            reverseArray(array);
            System.out.println("Array sorted in descending order:");
        } else {
            System.out.println("Invalid input. Please enter 'R' or 'u' for sorting order.");
            return;
        }

        // Print the sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Function to reverse an array
    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

