import java.util.Scanner;

public class methodex {
    // With arguments without return type.....
    

    public static void sum(int a , int b){
        //return (a+b)/2; 
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();
       // System.out.println(sum(a,b));
       sum(a,b);
}
}
