package se2402;
import java.util.Scanner;

public class Average {
    //Complexity: linear - 0(N)
    public static double average(int[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        return(double) sum / array.length;
    }
    //Complexity: linear - 0(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(average(array));
    }
}
