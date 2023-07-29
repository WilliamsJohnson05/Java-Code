package CloseLabBook;

public class TwodrectangleArray {
	    public static void main(String[] args) {
	        int rows = 4; 

	        // Initialize the two-dimensional rectangular array
	        int[][] matrix = new int[rows][];

	    
	        int Number = 1;
	        for (int i = 0; i < rows; i++) {
	            matrix[i] = new int[i + 1]; // Each row has a different number of elements
	            for (int j = 0; j <= i; j++) {
	                matrix[i][j] = Number;
	                Number++;
	            }
	        }

	        // Display the matrix
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	    	
	    


