package se2402;
import java.util.Scanner;

public class Factorial {
    //Complexity: linear - 0(N)
    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }
    //Complexity: linear - 0(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
