package StringQuestions;
//Question1:Count how many times lower case vowels occurred in a String entered by the user.
public class Count_Vowels {
    public static void countVowels(String str){
        int countVowel = 0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countVowel++;
            }
        }
        System.out.println("The count of vowels is :"+countVowel);

    }
    public static void main(String[] args) {
        String str = "aeioujj";
        countVowels(str);
    }
}
