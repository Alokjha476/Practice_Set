package StringQuestions;

public class String_Compression {
    public static String compression(String string) {
        String newStr = "";
        for (int i = 0; i < string.length(); i++) {
            Integer count = 1;
            while (i < string.length() - 1 && string.charAt(i) == string.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += string.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aabbccdeffgg";
        System.out.println(compression(str));
    }
}
