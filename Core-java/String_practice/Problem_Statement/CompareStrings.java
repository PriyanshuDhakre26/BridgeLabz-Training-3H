package String_practice.Problem_Statement;
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int len = Math.min(s1.length(), s2.length());
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if (result == 0) result = s1.length() - s2.length();
        if (result < 0) System.out.println("String 1 comes before String 2");
        else if (result > 0) System.out.println("String 1 comes after String 2");
        else System.out.println("Both strings are equal");
    }
}

