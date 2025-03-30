package se2402;
import java.util.Scanner;

public class Digits {
    //Complexity: linear - 0(N)
    public static boolean isDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    //Complexity: linear - 0(N)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isDigit(input)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
