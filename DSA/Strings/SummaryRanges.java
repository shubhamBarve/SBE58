package Strings;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int nums[] = {0,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {


        List <String> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) return ans;
    int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                // Add the range or single number to the result
                if (first == nums[i - 1]) {
                    ans.add(String.valueOf(first));
                } else {
                    ans.add(first + "->" + nums[i - 1]);
                }
                // Update the start of the next range
                first = nums[i];


            }

        }
        if (first == nums[nums.length - 1]) {
            ans.add(String.valueOf(first));
        } else {
            ans.add(first + "->" + nums[nums.length - 1]);
        }

return ans;
    }
}
