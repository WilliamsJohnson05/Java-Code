package CloseLabBook;
import java.util.ArrayList;

public class ArmstrongOrPalindrome {
	    public static void main(String[] args) {
	        System.out.println("Prime numbers between 1 and 100:");
	        generatePrimeNumbers(1, 65);
	        

	        int number1 = 145; 
	        int number2 = 23; 

	        System.out.println("\nChecking number1 (" + number1 + ")");
	        checkNumberProperties(number1);

	        System.out.println("\nChecking number2 (" + number2 + ")");
	        checkNumberProperties(number2);
	    }

	    public static void generatePrimeNumbers(int start, int end) {
	        ArrayList<Integer> primeNumbers = new ArrayList<>();
	        

	        for (int num = start; num <= end; num++) {
	            if (isPrime(num)) {
	                primeNumbers.add(num);
	            }
	        }

	        System.out.println(primeNumbers);
	    }

	    // Function to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    // Function to check properties of a number (Armstrong, Perfect, Palindrome)
	    public static void checkNumberProperties(int number) {
	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else if (isPerfectNumber(number)) {
	            System.out.println(number + " is a Perfect number.");
	        } else if (isPalindromeNumber(number)) {
	            System.out.println(number + " is a Palindrome number.");
	        } else {
	            System.out.println(number + " is neither an Armstrong number, Perfect number, nor Palindrome number.");
	        }
	    }

	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrongNumber(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int numDigits = String.valueOf(number).length();

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numDigits);
	            number /= 10;
	        }

	        return originalNumber == sum;
	    }

	    // Function to check if a number is a Perfect number
	    public static boolean isPerfectNumber(int number) {
	        int sum = 0;
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        return sum == number;
	    }

	    // Function to check if a number is a Palindrome number
	    public static boolean isPalindromeNumber(int number) {
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }
	}







