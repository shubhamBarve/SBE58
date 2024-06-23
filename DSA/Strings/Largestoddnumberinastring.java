package Strings;

public class Largestoddnumberinastring {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("10133890"));
    }

    public static String largestOddNumber(String num) {
        int ans = Integer.parseInt(num);
        int ret =0;
        if(ans%2==1){
            return num;
        }
        while(ans!=0){
            int rem = ans%10;
            if(rem%2==1){
                ret = Math.max(rem,ret);

            }
            ans =ans/10;
        }
        if(ret==0){
            return "";
        }
        return Integer.toString(ret);
    }
}
