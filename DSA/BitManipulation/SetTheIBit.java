package BItwiseOperator;

public class SetTheIBit {
    public static void main(String[] args) {
        int num = 9;
        int i =2;

        System.out.println("value after setting "+i+" bit "+findValue(num,i));
    }

    private static int findValue(int num, int i) {

        int left = 1<<i;
        return num|left;

    }

}
