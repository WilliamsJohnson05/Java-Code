package OpenLabBook;

import java.util.Scanner;

public class CheckOddOrEven {
	public static void main(String[] args) {
		int val;
		System.out.println("Emter an Integer Number");
		
		Scanner input = new Scanner(System.in);
		val = input.nextInt();
		
		if(val % 2==0)
		  System.out.println("What Number you have Entered is Even");
		else
		  System.out.println("What Number you have Entered is Odd");
		}

}
