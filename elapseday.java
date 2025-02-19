import java.util.*;
class elapseday {
    public static void main(String[] args) {
     int days, months, year;

     Scanner scan = new Scanner(System.in);
     int sum = 0;
     days = scan.nextInt();
     months = scan.nextInt();
     year = scan.nextInt();
     switch(months) {
        case 1: sum= sum+31;
        case 2: if((year%4 ==0&& year%100!=0) || (year%400==0));
        sum = sum +29;           
            sum = sum +28;          // month of february has 29 days
            case 3 :sum =sum+31;      // month of March has 31 days
            case 4: sum= sum +30;       // month of April has 30 days
            case 5 :sum=sum +31;      // month of May has 31 days
            case 6 :sum=sum +30;   // month of June has 30 days
            case 7 :sum=sum +31;      // month of July has 31 days
            case 8 :sum=sum +31;      // month of August has 31 days
            case 9 :sum=sum +30;     // month of September has 30 days
            case 10 :sum=sum +31;
            case 11 :sum=sum +30;
            case 12 :sum=sum +31;
        }
        
        sum =sum-days;
        System.out.println("Remaining sum" +sum);
        if ((year%4==0 && year%100 != 0) || (year%400==0))
            System.out.println(366-sum);
            else 
            System.out.println(365-sum);
        }
     }