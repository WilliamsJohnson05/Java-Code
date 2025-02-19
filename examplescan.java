import java.lang.System;
import java.util.Scanner;

class examplescan {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        System.out.print("My name is " + name);
        System.out.print(",my age is "+ age);
        System.out.print(",my address is "+ address);
    }

}