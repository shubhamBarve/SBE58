package RecursiveBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
            int n = 2, k = 2;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> currSol = new ArrayList<>();

            combinerRecursive(1,n,k,ans,currSol);


            return ans;

    }

    private static void combinerRecursive(int  start,int n, int k, List<List<Integer>> ans, List<Integer> currSol) {

        if(currSol.size()==k){

            ans.add(new ArrayList<>(currSol));
            return;
        }

        for (int i = start; i <=n ; i++) {
            if(!currSol.contains(i)){

                currSol.add(i);
                combinerRecursive(i+1 ,n,k,ans,currSol);
                currSol.remove(currSol.size()-1);
            }
        }



    }
}
