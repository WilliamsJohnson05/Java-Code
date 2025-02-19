import java.util.Scanner;

class sample {  
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
           String name = scan.nextLine();
           float score = scan.nextInt();
           scan.nextLine();
           String Department = scan.nextLine();
            System.out.println("Name is "+ name);
            System.out.println("Score is "+ score/10+ "/10");
            System.out.print("My Department is "+ Department);
        }
    }