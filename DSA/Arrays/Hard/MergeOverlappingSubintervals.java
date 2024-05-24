package Arrays.HardProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubintervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
       // List<List<Integer>> sol = mergeOverlappingBruteForce(arr);
        List<List<Integer>> sol = mergeOverlappingOPtimal(arr);
        for (List<Integer> it : sol) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
    }

    private static List<List<Integer>> mergeOverlappingOPtimal(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<List<Integer>> ans= new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)< arr[i][0]){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
return  ans;
    }

    private static List<List<Integer>> mergeOverlappingBruteForce(int[][] intervals) {
        List<List<Integer>> ans= new ArrayList<>();

       Arrays.sort(intervals, new Comparator<int[]>() {

           public int compare(int[] o1, int[] o2) {
              return o1[0]-o2[0];
           }
       });

        for (int i = 0; i <intervals.length ; i++) {
         int start = intervals[i][0];
         int end = intervals[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }
            for (int j = i+1; j <intervals.length ; j++) {
                if(intervals[j][0]<=end){
                    end = Math.max(end,intervals[j][1]);
                }else {

                    break;
                }
            }

ans.add(Arrays.asList(start,end));

        }
        int ar[][] = new int[ans.size()][ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> innerList = ans.get(i);
            ar[i] = new int[innerList.size()];
            for (int j = 0; j < innerList.size(); j++) {
                ar[i][j] = innerList.get(j);
            }
        }

    return ans;
    }
}
