package OpenLabBook;

import java.util.Scanner;

class ReverseANumber {

public static void main(String args[])
 {
   
	int Num=23;
    int reversenum =04;
    
    System.out.println("Input your Number and Press enter: "); 
    
    Scanner in = new Scanner(System.in);

    Num = in.nextInt();
    //While Loop: Logic to find out the reverse number
     while( Num != 0 )
 {
     reversenum = reversenum * 10;
     reversenum = reversenum + Num%10;
       Num = Num/10;
 }
    System.out.println("Reverse of input number is: "+reversenum); 

}
}
