package OOPS;

public class SelectionSort {
public static void SelectionSort(int[] arr) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		int minIndex=i;
		for(int j=i+1;j<n;j++) {
			if (arr[j]< arr[minIndex]) {
				minIndex =j;
			}
				
		}
int temp =arr[minIndex]; 
	arr[minIndex] =arr[i];
	arr[i]=temp;
	}
}
public static void main(String[] args) {
	int[] arr= {96,45,63,17,33,50,51,21};
	System.out.println("Array before sorting:");
	printArray(arr);
	
	SelectionSort(arr);
	System.out.println("\nArray after sorting:");
	printArray(arr);
}
public static void printArray(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
		System.out.println();
	}
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

     