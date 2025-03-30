package se2402;
import java.util.Scanner;

public class Power {
    //Complexity: linear - 0(e)
    public static int pow(int b, int e) {
        int result = 1;
        for (int i = 1; i <= e; i++) {
            result *= b;
        }
        return result;
    }
    //Complexity: linear - 0(e)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(pow(b, e));
    }
}
