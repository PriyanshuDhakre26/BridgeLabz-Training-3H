import java.util.Scanner;

public class TextToLowercase {

    public static String manualToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manualLower = manualToLower(input);
        String builtInLower = input.toLowerCase();

        System.out.println("Manual Conversion: " + manualLower);
        System.out.println("Built-in Conversion: " + builtInLower);

        boolean isSame = compareStrings(manualLower, builtInLower);
        System.out.println("Are both conversions equal? " + isSame);

        sc.close();
    }
}
