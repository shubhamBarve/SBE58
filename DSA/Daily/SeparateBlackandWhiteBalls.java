package Daily;

public class SeparateBlackandWhiteBalls {
    public static void main(String[] args) {
        //https://leetcode.com/problems/separate-black-and-white-balls/description/
        String s = "0010010";
        System.out.println(minimumSteps(s));
    }
    public static long minimumSteps(String s) {
    StringBuilder stringBuilder = new StringBuilder(s);
        int l=0;
        int r=s.length()-1;
        long count=0;
        long ans =0;
        for (char ch : s.toCharArray()){
            if(ch=='1'){
                count++;
            }
            else {
                ans+=count;
            }
        }
return ans;
    }

    private static void swapstring(StringBuilder stringBuilder, int l, int r) {
        char temp = stringBuilder.charAt(l);
        stringBuilder.setCharAt(l, stringBuilder.charAt(r));
        stringBuilder.setCharAt(r, temp);

    }


}
