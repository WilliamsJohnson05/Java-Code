package OpenLabBook;

public class TypeCasting {
	    public static void main(String[] args) {
	    	
	        // Implicit Typecasting (Widening Conversion)
	        int intValue = 42;
	        double doubleValue = intValue; // Implicit typecasting from int to double
	        System.out.println("Implicit typecasting - int to double: " + doubleValue);

	        // Explicit Typecasting (Narrowing Conversion)
	        double doubleNum = 3.14159;
	        int intNum = (int) doubleNum; // Explicit typecasting from double to int
	        System.out.println("Explicit typecasting - double to int: " + intNum);

	        // Typecasting with char and int
	        char charValue = 'X';
	        int intValueFromChar = charValue; // Typecasting char to int (ASCII value)
	        System.out.println("Typecasting char to int: " + intValueFromChar);

	        // Typecasting with int and char
	        int intValueForChar = 98;
	        char charValueFromInt = (char) intValueForChar; // Typecasting int to char
	        System.out.println("Typecasting int to char: " + charValueFromInt);
	    }
	}

		
		
   

