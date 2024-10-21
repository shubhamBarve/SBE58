package RecursiveBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> currSolution = new ArrayList<>();

            permutebackTrack(nums,ans,currSolution);

            return ans;

    }

    private static void permutebackTrack(int[] nums,List<List<Integer>> ans, List<Integer> currsolution) {
        if(currsolution.size()==nums.length){
            ans.add(new ArrayList<>(currsolution));
        return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!currsolution.contains(nums[i])){
                currsolution.add(nums[i]);
                permutebackTrack(nums,ans,currsolution);
                currsolution.remove(currsolution.size()-1);
            }


        }


    }

}
