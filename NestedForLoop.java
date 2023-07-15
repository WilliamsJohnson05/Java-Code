package javaLabCard1;

public class NestedForLoop {
    public static void main(String[] args) {
        int r = 2;
        int j = 3;
        
        for (int y = 0; y<=r; y++) {
            for (int  x = 0; x<=j; x++) {
                System.out.print(y+" "+x);
            }
            System.out.println();
        }
    }
}

