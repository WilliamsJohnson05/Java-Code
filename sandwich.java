import java.util.*;
import java.util.Scanner;

public class sandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k=1,n=1,s;
        n=sc.nextInt();
        if (n%2==0)
             s=n-1;
            else
         s=n-2;
        for(i=1;i<=n;i+=2,System.out.println()){
            for(j=1;j<=n;j++){
                System.out.print(k++);
            }
            k=k+n;
        }
        for(i=s;i>=1;i=i-2,System.out.println()){
            for(j=1;j<=n;j++){
                System.out.print((i*n)+j);
            }
        }
    }
}