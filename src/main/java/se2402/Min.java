package se2402;
import java.util.Scanner;

public class Min {
    public static int findMin (int[] array) {
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findMin(array));
    }
}
