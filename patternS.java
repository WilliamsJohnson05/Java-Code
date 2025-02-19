import java.util.Scanner;

// without argument with return type....
public class patternS{
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        int i,j;
        int n = scan.nextInt();
        
        for (i=1; i<=n ;i++, System.out.println()){
            for(j=1; j<=n ;j++){
                if (i==1|| j==1){
                    if (i<=3|| j==(n/2)+1)
                
                    System.out.print("*");
                    
                    System.out.print(" ");
                  
                    }
                }
            }
               
        }   
     }
