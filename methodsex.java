public class methodsex {

    int a,b;
     subtraction (int a , int b){
        this.a=a;
        this.b=b;
     }
        public void sub(){
            System.out.println(a-b);
        }
     }
     public class methodex{
        public static void main(String[] args) {
            int a =5, b=5;
            System.out.println(a+b);
            subtraction s = new subtraction(a,b);
                s.sub();
            }
        }