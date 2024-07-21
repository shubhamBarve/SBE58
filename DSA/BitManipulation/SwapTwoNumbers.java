package BItwiseOperator;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1= 3;
        int num2 = 6;

        num1  = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
