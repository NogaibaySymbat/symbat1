package se2402;
import java.util.Scanner;

public class Prime {
    //Complexity: square root - 0(Vn)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //Complexity: square root - 0(Vn)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println("prime");
        }
        else {
            System.out.println("composite");
        }
    }
}
