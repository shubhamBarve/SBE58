package RecursiveBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

        int []candidates = {2,3,6,7};
        int target = 9;
        System.out.println(combinationSum(candidates,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currSol = new ArrayList<>();

          combinationSumRecursive(0,candidates,target,ans,currSol,0);


        return ans;
    }

    private static void combinationSumRecursive(int start,int[] candidates, int target,List<List<Integer>> ans,List<Integer> currSol,int currSum) {

        if(currSum==target){
            ans.add(new ArrayList<>(currSol));
            return;
        }
        if(currSum>target || start>candidates.length-1){
            return;
        }

       combinationSumRecursive(start+1,candidates,target,ans,currSol,currSum);

        currSol.add(candidates[start]);

        combinationSumRecursive(start,candidates,target,ans,currSol,currSum+candidates[start]);
        currSol.remove(currSol.size()-1);






    }
}
