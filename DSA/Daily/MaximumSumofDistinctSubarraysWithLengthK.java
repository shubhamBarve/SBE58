package Daily;

import java.util.HashMap;

public class MaximumSumofDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        int []nums = {1,1,1};
    int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
        System.out.println(optimal(nums,k));
    }

    private static long optimal(int[] nums, int k) {
        long ans=0;
        int left=0;
        int curr = 0;
        HashMap<Integer,Integer> map = new HashMap<>();



        for (int right =0; right < nums.length ; right++) {

            if (right >= k) {
                int count = map.get(nums[left]);
                curr = curr - nums[left];
                if (count == 1) {
                    map.remove(nums[left]);
                } else {
                    map.put(nums[left], map.get(nums[left]) - 1);
                }

                left++;
            }
                curr += nums[right];
                if (map.containsKey(nums[right])) {
                    map.put(nums[right], map.get(nums[right]) + 1);
                } else {
                    map.put(nums[right], 1);
                }

            if (right >= k - 1) {
                if (map.size() == k)
                    ans = Math.max(ans, curr);
            }

        }
        return  ans ;

    }

    public static long maximumSubarraySum(int[] nums, int k) {
            long ans=0;

        for (int i = 0; i < nums.length-k+1; i++) {
            ans = Math.max(ans,calculate(nums,i,k));
        }


            return ans;
    }

    private static long calculate(int[] nums, int i, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        long ans = 0;
        for (int j = i; j < i+k ; j++) {
            if(map.containsKey(nums[j])){
               return 0;
            }
            else {
                ans += nums[j];
                map.put(nums[j],1);
            }
        }
        return ans;
    }
}
