import java.util.Scanner;

public class TrimSpaces {

    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String manualSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
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
        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);

        String manualTrimmed = "";
        if (indexes[0] <= indexes[1]) {
            manualTrimmed = manualSubstring(input, indexes[0], indexes[1]);
        }

        String builtInTrimmed = input.trim();

        System.out.println("Manual Trimmed:   [" + manualTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");

        boolean isSame = compareStrings(manualTrimmed, builtInTrimmed);
        System.out.println("Are both results equal? " + isSame);

        sc.close();
    }
}
