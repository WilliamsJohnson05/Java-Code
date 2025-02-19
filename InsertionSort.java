package OOPS;

import java.util.Scanner;

public class InsertionSort {
    /* Function to sort array using insertion sort */
    void sort(int arr[]) {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }
        InsertionSort ob = new InsertionSort(); // Corrected the typo here
        ob.sort(arr);
        printArray(arr); // Corrected the method call here
    }
}
