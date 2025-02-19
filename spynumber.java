import java.util.Scanner;
public class spynumber {
    public static void main(String[] args) {

        int digit =0, sum = 1 , digit1 =0, sum1=0;
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        while(n != 0){
            digit = n%10;
        sum = sum*digit;
        sum1=sum1+digit;
        n = n/10;
        }
        if(sum==sum1) 
        System.out.println("true");
        else
        System.out.println("false");
    }
}
