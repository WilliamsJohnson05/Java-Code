package CloseLabBook;
import java.util.Scanner;

public class CalculateResultOfStudents {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numOfStudents = scanner.nextInt();

	        System.out.print("Enter the number of subjects/marks: ");
	        int numOfSubjects = scanner.nextInt();

	        int[][] marks = new int[numOfStudents][numOfSubjects];

	        // Input marks for each student
	        for (int i = 0; i < numOfStudents; i++) {
	            System.out.println("Enter marks for Student " + (i + 1) + ":");
	            for (int j = 0; j < numOfSubjects; j++) {
	                System.out.print("Enter mark " + (j + 1) + ": ");
	                marks[i][j] = scanner.nextInt();
	            }
	            System.out.println();
	        }

	        scanner.close();

	        // Calculate total and average marks for each student
	        int[] totalMarks = new int[numOfStudents];
	        double[] averageMarks = new double[numOfStudents];

	        for (int i = 0; i < numOfStudents; i++) {
	            int total = 0;
	            for (int j = 0; j < numOfSubjects; j++) {
	                total += marks[i][j];
	            }
	            totalMarks[i] = total;
	            averageMarks[i] = (double) total / numOfSubjects;
	        }

	        // Display the results
	        System.out.println("Student\tTotal Marks\tAverage Marks");
	        for (int i = 0; i < numOfStudents; i++) {
	            System.out.println((i + 1) + "\t\t" + totalMarks[i] + "\t\t" + averageMarks[i]);
	        }
	    }
	}


