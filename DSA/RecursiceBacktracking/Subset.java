package RecursiveBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    //https://leetcode.com/problems/subsets/
    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> currsolution = new ArrayList<>();

        recursiveBacktracking(nums,ans,currsolution,0);
        return ans;

    }

    private static void recursiveBacktracking(int[] nums, List<List<Integer>> ans, List<Integer> currsolution, int i) {
            if(i== nums.length){
                ans.add(new ArrayList<>(currsolution));
                return;
            }

            recursiveBacktracking(nums,ans,currsolution,i+1);

            currsolution.add(nums[i]);
            recursiveBacktracking(nums,ans,currsolution,i+1);

            currsolution.remove(currsolution.size() - 1);
    }
}
