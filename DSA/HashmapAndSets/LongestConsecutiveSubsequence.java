package HashmapAndSets;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
            int [] nums = {100,99,97,98,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <nums.length ; i++) {
            set.add(nums[i]);
        }

        int length = 0;

        for (int i = 0; i <nums.length ; i++) {
            if(!set.contains(nums[i]-1)){
                    int next = nums[i]+1;
                   int count =1;
                   while (set.contains(next)){
                       next++;
                       count++;
                   }
                   length = Math.max(length,count);
            }
        }
return length;

    }
}
