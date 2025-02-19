import java.util.Scanner;
public class patternplus {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // i - rows , j - columns
        for(int i=1; i<= n; i++, System.out.println()) {
            for (int j=1; j<=n; j++) {
                if (i==(n/2)+1 | j==(n/2)+1) {
                    System.out.print("*");
                }
                else 
                 System.out.print(" ");
            }
        }
    }
}
