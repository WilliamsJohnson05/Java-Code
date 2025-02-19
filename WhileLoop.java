package OpenLabBook;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		 int number, sum = 0;
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter a Integer value Which is below 10: ");  
		 number = sc.nextInt();

		 while (number <= 16) {
		 sum = sum + number;
		 number++;
		 }
		 System.out.format(" Sum of the Numbers From the While Loop is: %d ", sum);
	}}
