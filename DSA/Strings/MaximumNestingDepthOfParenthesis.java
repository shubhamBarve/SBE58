package Strings;

public class MaximumNestingDepthOfParenthesis

{

    public static void main(String[] args) {
        String str = "(1)+((2))+(((3)))";

        System.out.println(countParenthess(str));
    }

    private static int countParenthess(String str) {
        int ans=0;
        int max = -1;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='('){
                ans++;
            }else if(str.charAt(i)==')'){
                ans--;
            }
            max= Math.max(max,ans);
        }


        return max;
    }
}
