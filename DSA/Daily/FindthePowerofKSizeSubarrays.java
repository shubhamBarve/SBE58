package Daily;

public class FindthePowerofKSizeSubarrays {
    //https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/description/?envType=daily-question&envId=2024-11-16
    public static void main(String[] args) {


        int []nums = {3,2,3,2,3,2};
        int k =6;
        int ans[] = resultsArray(nums,k);
        System.out.print("[");
        for (int an : ans) {
            System.out.print(  an + ",");
        }
        System.out.print("]");


    }
    public static int[] resultsArray(int[] nums, int k) {
            int ans[]= new int[nums.length-k+1];

        for (int i = 0; i <ans.length ; i++) {
            ans[i]=checkPower(nums,i,k);
        }
        return ans;
    }

    private static int checkPower(int[] nums, int i, int k) {
        int seq =nums[i];
        int max = nums[i];
        for (int j = i+1; j <i+k ; j++) {

            max = Math.max(max,nums[j]);
            if(seq+1 == nums[j]){
                seq = nums[j];
            }else {
                return -1;
            }

        }
        return max;

    }
}
