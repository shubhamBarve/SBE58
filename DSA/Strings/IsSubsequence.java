package Strings;

public class IsSubsequence {
    public static void main(String[] args) {
        String s="aaaaaa";
        String t = "bbaaaa";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int pos =0;
        int count = 0;
        boolean ans=false;
        for(int i =0;i<s.length();i++){
            ans=false;
            for(int j=pos;j<t.length();j++){

                if(s.charAt(i)==t.charAt(j)){
                    pos=j+1;
                    ans=true;
                    count++;
                    break;
                }
            }

        }
        if(count==s.length()) return true;
        return false;

    }
}
