import java.util.Scanner;

public class patternsnake {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int i, j, k = 1;
        int n = scan.nextInt();
        
        for (i = 1; i <= n; i++, System.out.println()) {
            if (i % 2 != 0) { 
                for (j = 1; j <= n; j++) {
                    System.out.print(k++ + " ");
                }
            } else {
                int temp = k + n - 1; 
                for (j = 1; j <= n; j++) {
                    System.out.print(temp-- + " ");
                }
                k += n;
            }
        }
    }
}
