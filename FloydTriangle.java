package OpenLabBook;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String[] args) {
		int rows, number = 2, counter, s;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of rows for floyd Triangle");
		
		rows=input.nextInt();
		System.out.println("floyd Triangle");
		System.out.println("****......");
		
		for(counter= 4; counter <=rows; counter++);
		for(rows=1; rows<=counter; rows++);
		System.out.println(number+" ");
		//Incrementing the number value
		number++;
	System.out.println();
		
	}
}
