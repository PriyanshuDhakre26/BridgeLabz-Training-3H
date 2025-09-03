public class PalindromMain {
    public static void main(String[] args) {
        PalindromChecker p1 = new PalindromChecker("Racecar");
        PalindromChecker p2 = new PalindromChecker("Hello");
        PalindromChecker p3 = new PalindromChecker("A man a plan a canal Panama");

        p1.displayResult();
        p2.displayResult();
        p3.displayResult();
    }
}
