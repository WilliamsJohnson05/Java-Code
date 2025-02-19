import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int w = scan.nextInt();
        /*if (true ) {
            System.out.println("yes");
        }
        else
        System.out.println("no");
    }
}*/

   System.out.println(false ? "yes" : "no");

   String result = 5>2 ? "yes" : "no";
   System.out.println(result);

   System.out.println(s>w ? "a is greater" : "b is greater");


    }
}


/*  Syntax for Ternary Variable
variable  = (condition) ?  valueifTrue : valueifFalse

true ? "yes" : "no"
*/

