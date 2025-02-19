package CloseLabBook;

public class twodrectangulararray {

	    public static void main(String[] args) {
	        int Rows = 4;
	        int Columns = 4;
	        int num = 1;
	        
	        int[][] matrix = new int[Rows][Columns];
	        
	        
	        // Fill the matrix with numbers
	        for (int x= 0; x < Rows; x++) {
	            for (int r = 0; r < Columns; r++) {
	                matrix[x][r] = num;
	                num++;
	            }
	        }
	        
	        // Display the matrix
	        for (int y = 0; y < Rows; y++) {
	            for (int z = 0; z < Columns; z++) {
	                System.out.printf("%2d ", matrix[y][z]);
	            }
	            System.out.println();
	        }
	    }
	}


