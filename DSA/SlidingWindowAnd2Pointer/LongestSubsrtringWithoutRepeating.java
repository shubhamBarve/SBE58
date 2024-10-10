package SlidingWindowAnd2Pointer;

import java.util.HashSet;

public class LongestSubsrtringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxWindow=0;
        int l=0;

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i <s.length() ; i++) {
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;

            }
            int window= (i-l)+1;
            maxWindow = Math.max(maxWindow,window);
            set.add(s.charAt(i));
        }



        return maxWindow;
    }
}
