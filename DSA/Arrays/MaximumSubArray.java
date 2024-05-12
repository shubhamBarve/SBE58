package Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr =  { -2, 1, -3, 4, -1, 2, 2, -5, 4};
        int n = arr.length;

        //BruteForceApproach
       // int maxSum = maxSubarraySumBruteForce(arr, n);
        //System.out.println("The maximum subarray sum is: " + maxSum);

        //BetterApproach
        int maxSum = maxSubarraySumOptimized(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
    // { -2, 1, -3, 4, -1, 2, 1, 5, 4};
    private static int maxSubarraySumOptimized(int[] arr, int n) {
        int maxi = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+arr[i];
            if(sum<0)
                sum=0;
            maxi = Math.max(sum,maxi);

        }
        return maxi;
    }

    private static int maxSubarraySumBruteForce(int[] arr, int n) {

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {


            for (int j = i; j < n; j++) {
                int sum =0;

                for (int k = i; k < j; k++) {
                    sum =sum+arr[k];

                }
                maxi = Math.max(maxi,sum);

            }

        }
        return maxi;
    }
}
