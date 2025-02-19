package williams;

import java.util.*;

public class CheckMobileNumber {
	public static void main(String[] args)
	{
		System.out.println("Enter your mobile number"); 
		 Scanner sc = new Scanner(System.in);
		String input = sc.next();
	  char c=128;
	  System.out.println(c);

	 System.out.println(numberOrNot(input)); 
	 if(numberOrNot(input) && (input.length() == 10))
	  
	
	   System.out.println("Good.......!!! You have entered valid mobile number");
	  else
	
	   System.out.println("Sorry.......!!!! You have entered invalid mobile number. Tryagain.....");
	 
	}
	  static boolean numberOrNot(String input)
	   {
	  try
	  {
	    Long.parseLong(input);
	  }
	    catch(NumberFormatException ex)
	  { 
	    ex.printStackTrace(); 
	    return false;
	}

	return true;
	  }
	
}
