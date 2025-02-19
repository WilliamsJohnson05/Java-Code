import java.util.*;
public class Arrayex4{
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n= sc.nextInt();
        int arr[][]=new int[n][];
        for(i=0;i<n;i++)
        arr[i]=new int[sc.nextInt()];
        for(i=0;i<n;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++,System.out.println()){
            for(j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");s
                
            }
        }


    }
}