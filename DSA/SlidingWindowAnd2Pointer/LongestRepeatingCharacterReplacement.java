package SlidingWindowAnd2Pointer;

import java.util.HashSet;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
            String s = "AABABBA";
            
              int k = 1;
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {
        int maxWindow=0;

        int arr[]= new int[26];
        int l=0;
        for (int r = 0; r <s.length() ; r++) {
            arr[s.charAt(r)-'A']+=1;
            int max=-1;
            max=Math.max(max,arr[s.charAt(r)-'A']);
            while ((r-l+1)-max>k){
                arr[s.charAt(l)-'A']-=1;
                l++;
            }
            maxWindow=Math.max(maxWindow,(r-l)+1);
        }



        return maxWindow;
    }
    public  static int maxfromArray(int arr[]){
        int max=-1;
        for (int i = 0; i < arr.length; i++) {

            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
