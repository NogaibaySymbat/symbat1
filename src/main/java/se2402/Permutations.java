package se2402;
import java.util.Scanner;

public class Permutations {
    //Complexity: factorial - 0(n!)
    public static void permutations(String str, String result){
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String remaining = left + right;
            permutations(remaining, result + ch);
        }
    }//Complexity: factorial - 0(n!)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string: ");
        String input = scanner.nextLine();
        permutations(input,"");
    }
}
