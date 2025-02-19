package OOPS;

import java.util.Scanner;

public class SequentialSearch {
 public static int search(int arr[], int x) {
	int n=arr.length;
	for (int i=0 ;i<n; i++) {
		if(arr[i] == x)
			return i;
	}
	return -1;
}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the size of the array :");
	int size = input.nextInt();
	int[] arr =new int[size];
	for(int i=0 ; i<size; i++) {
		System.out.println("Enter element to search :");
		arr[i] = input.nextInt();
	}
	System.out.println("Enter the element to search :");
	int searchElement = input.nextInt();
	int result = search(arr, searchElement);
	if(result ==-1)
		System.out.println("Elemnent is not present in array : ");
	else
		System.out.println("Element is presentat index" +result);
}}

	