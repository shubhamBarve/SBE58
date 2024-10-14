package HeapProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
      int []  nums = {1,1,1,2,3,3,4};
        int k = 3;
        int ans[]=  topKFrequent(nums,k);
        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[]=new int[k];
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1 );
            }else {
                map.put(nums[i],1 );
            }
        }
    int m=1;

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)->b.getValue()-a.getValue());

        for (int i = 0; i < k; i++) {
            ans[i]=list.get(i).getKey();
        }

        return  ans;
    }
}
