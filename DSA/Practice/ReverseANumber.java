package Practice;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 5432;

        reverse(num);

        reverse1(num);
    }

    private static void reverse1(int num) {
        int reverse=0;
            while(num!=0){
                int rem = num%10;
                num/=10;
                reverse=reverse*10+rem;
            }
        System.out.println(reverse);
    }

    private static void reverse(int num) {

        String str = Integer.toString(num);
        String newStr="";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr= newStr+str.charAt(i);
        }

        System.out.println(newStr);
    }
}
