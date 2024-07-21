package BItwiseOperator;

public class CheckIfBitSet {
    public static void main(String[] args) {
        int num =4;
        int i= 2;

        System.out.println("bit set"+i+" is :"+checkValue(num,i));
    }

    private static boolean checkValue(int num, int i) {

        if( (num & (1<<i))!=0){
            return true;
        }
        else
            return false;
    }
}
