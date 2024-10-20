package Daily;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {
    public static void main(String[] args) {
        int []nums = {881784984,829998714,730002802,56524562,120336848,548306998,801116106,828640251,519131180,819176153,476262254,15904939,540793851,53572296,259044378,491129827,561147559,205793082,967833729};
        int k = 16;
        System.out.println(maxKelements(nums,k));
    }
    public static long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <nums.length ; i++) {
            maxHeap.add(nums[i]);
        }

        for (int i = 1; i <=k ; i++) {
            int sum = maxHeap.poll();
            ans+=sum;
            sum = (int) Math.ceil((double)sum/3);
            maxHeap.add(sum);
        }



        return ans;

    }
}
