package javaLabCard1;

public class CalculateAverageOfNNumber {
	    public static void main(String[] args) {
	    	// Example array of numbers
	        int[] numbers = {1,2,6,24,120,720,5040}; 
	        double average = calculateAverage(numbers);
	        System.out.println("Average: " + average);
	    }

	    public static double calculateAverage(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return (double) sum / numbers.length;
	 }
}


