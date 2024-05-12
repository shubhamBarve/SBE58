package Practice;

public class CountNoOfDigits {
    public static void main(String[] args) {
        int num=12345;
        countDigits(num);
        countDigits1(num);
        countDigits2(num);
    }

    private static void countDigits2(int num) {
        int count = (int) Math.log10(num)+1;
        System.out.println(count);

    }

    private static void countDigits1(int num) {

        String str = Integer.toString(num);
        System.out.println(str.length());
    }

    private static void countDigits(int num){
        int count =0;

        while (num!=0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
