package OpenLabBook;

import java.util.Scanner;
public class Integer {
	public static void main(String[] args) {
		
		//Creates a reader instance which takes input from Standard input-keyboard
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Numbers: ");
		
		//nextint() read the next integer from thr keyboard
		int Number = reader.nextInt();
		
		//println() prints the below line to the Output 
		System.out.println("You Entered: "+ Number);
		
	}
	

}