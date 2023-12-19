package StringQuestions;

public class CountString {
    public static void count(String str){
        Integer count = 0;
        for (int i = 0; i <str.length() ; i++) {
           if (str.charAt(i)== ' '){
               i++;
           }
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str = "Alok Kumar";
        System.out.println(str.length());
        count(str);



    }
}
