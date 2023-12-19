package StringQuestions;

public class StringPalindrome {
    public static boolean palindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        String str1 = "Alok";
        System.out.println(palindrome(str));
        System.out.println(palindrome(str1));
    }
}
