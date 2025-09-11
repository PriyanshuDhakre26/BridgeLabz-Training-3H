import java.util.Scanner;

public class VowelConsonantChecker {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // convert uppercase to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeString(String text) {
        int len = text.length();
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("\n===== Character Analysis =====");
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("--------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] analysis = analyzeString(input);
        displayTable(analysis);

        sc.close();
    }
}
