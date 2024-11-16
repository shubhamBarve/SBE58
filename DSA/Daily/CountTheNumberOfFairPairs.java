package Daily;

public class CountTheNumberOfFairPairs {

    // https://leetcode.com/problems/count-the-number-of-fair-pairs/description/?envType=daily-question&envId=2024-11-13

    public static void main(String[] args) {
      int[]  nums = {0,1,7,4,4,5};
      // 0,1,4,4,5,7
// index// 0,1,2,3,4,5
     //  (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5)
     //
      int lower = 3, upper = 6;
        System.out.println(countFairPairs(nums,lower,upper));
    }


    public static long countFairPairs(int[] nums, int lower, int upper) {
        long ans= 0;
        //BruteForce

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j]>=lower && nums[i]+nums[j]<=upper){
                    ans++;
                }
            }
        }
        return ans;

    }
}
