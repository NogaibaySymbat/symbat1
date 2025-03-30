package se2402;
import java.util.Scanner;

public class Gcd {
    //Complexity: logarithmic - 0(log(min(a,b)))
    public static int gcd(int a, int b) {
        if (b == 0)  return a;{
            return gcd(b, a % b);
        }
    }
    //Complexity: logarithmic - 0(log(min(a,b)))
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }
}
