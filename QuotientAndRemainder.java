package OpenLabBook;

public class QuotientAndRemainder {
    private static int dividend;
	private static int divisor;

	public static void main(String[] args) {
		int dividend = 16, divisor = 23;
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("Quotient =" + quotient);
		System.out.println("Remainder ="+ remainder);
		
	}

}
