import java.util.Scanner;
public class whileloopproblem {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int dig = 0, dig1 =0 , sum = 0, sum1 = 0;
        int n=scan.nextInt();
        int temp = n;
         while(n!= 0) {
            dig = n%10;
            sum= sum*10+dig;
            n = n/10;
        }
                    while(sum!= 0){
                        dig1 = sum%100;
                        sum1= sum1*100+dig1;
                  sum= sum/100;
            }
                System.out.println(sum1);
        }
}