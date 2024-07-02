package Strings;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowLongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String str = "abcan";
        System.out.println("The length of the longest substring without repeating characters is " + solve(str));
    }

    private static int solve(String str) {
        Map<Character,Integer> map = new HashMap<>();
        int r=0,l=0;
        int len=0;
        while (r<str.length()){
            if(map.containsKey(str.charAt(r))){
                l= Math.max(map.get(str.charAt(r))+1,l);
            }
            map.put(str.charAt(r),r);

            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }

}
