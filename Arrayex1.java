import java.util.Scanner;
public class Arrayex1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int i ,sum = 0, temp;
        for( i=0; i<n; i++) {
            arr[i]= scan.nextInt();
            
        }
        int rot = scan.nextInt() %n;
        while(rot!= 0){
            temp = arr[n-1];
            for (i=n-1; i>0; i--)
            arr[i] = arr[i-1];
            arr[0]= temp;
            rot--;
            }
            for (i=0; i<n; i++)
            System.out.print(arr[i] +" ");
        }
            
        }




//            System.out.print(arr[i]+" ");
// 140, 120,90,50,0 