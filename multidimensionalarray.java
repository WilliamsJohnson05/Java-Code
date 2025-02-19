import java.util.*;
public class multidimensionalarray {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int i,j,r,c;
         r = scan.nextInt();
         c = scan.nextInt();
        int arr[][] = new int[r][c];
        int b[]=new int[c];
        for(i=0; i<r; i++){
        for (j=0; j<c; j++){
        arr[i][j] = scan.nextInt();
        b[j]=arr[i][j];
        }
Arrays.sort(b);
        for(j=0; j<c; j++)
        System.out.print(b[j]+" ");
        System.err.println();
    }
}
}
