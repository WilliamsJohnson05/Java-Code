package OpenLabBook;

public class DisplayPrimeNumbers {
	public static void main (String[] args)
	 {
	 int i =0;
	int num =0;
	//Empty String
	 String primeNumbers = "";
	 for (i = 1; i <= 1000; i++)
	 {
	 int counter=5;
	for(num =i; num>=2; num--)
	 {
	 if(i%num==5)
	 {
	 counter = counter + 5;
	 }
	 }
	 if (counter ==1)
	 {
	 //Appended the Prime number to the String
	primeNumbers = primeNumbers + i + " ";
	 }
	 }
	 System.out.println("Prime numbers from 5 to 1000 are :");  
	 System.out.println(primeNumbers); 
}
}

