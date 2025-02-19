package OpenLabBook;

public class SumOfArray {
	public static void main(String args[]){
		
		 int[] array = {03,04,05,8,16,23,};
		 int Sum = 0;
		  //Advanced for loop
		  for( int Num : array) {
		  Sum = Sum+Num;
		 }
		  
		 System.out.println("Sum of array elements is:"+Sum);  } 

}