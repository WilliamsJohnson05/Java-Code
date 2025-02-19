import java.util.Scanner;
class gcdlcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
      
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("GCD: " + gcd + "\nLCM: " + lcm);
        System.out.println("Factors of " + a + ": ");
        findFactors(a);
        System.out.println("Factors of " + b + ": ");
        findFactors(b);
    }

    public static int findGCD(int a, int b) {
        return (b == 0) ? a : findGCD(b, a % b);
    }
    public static void findFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}