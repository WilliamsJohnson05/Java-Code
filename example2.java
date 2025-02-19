import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
               System.out.print("Enter a number: ");
                 String num = scan.next(); 
                 scan.close();
                
                 char[] digits = num.toCharArray();
                 
                 for (int i = 1; i < digits.length; i += 2) {
                     char temp = digits[i];
                     digits[i] = digits[i - 1];
                     digits[i - 1] = temp;
                 }
                 
                 String result = new String(digits);
                 System.out.println("Output: " + result);
             }
         }
        