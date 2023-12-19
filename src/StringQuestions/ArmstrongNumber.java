package StringQuestions;
// Q1. abcd = a^n + b^n + c^n + d^n = abcd. It is a Armstrong number

public class ArmstrongNumber {
    public static void isArmstrong(int number) {
        int result = 0, OrignalNum = number;
        while (OrignalNum != 0) {
            int lastDigit = OrignalNum % 10;   // 1
            result += Math.pow(lastDigit, 3);// 1*1*1 + 0 = 1
            OrignalNum = OrignalNum / 10; // 371 = 37
            System.out.println(result);
        }
        if (result == number) {
            System.out.println("Is Armstrong");
        } else System.out.println("Not Armstrong");
    }

    public static void main(String[] args) {
        // 3*3*3+7*7*7+1*1*1 = 371
        isArmstrong(371);



    }
}
