package String_practice.Problem_Statement;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}

