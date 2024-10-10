package SlidingWindowAnd2Pointer;

public class BInarySubArrayWithsumK {
    public static void main(String[] args) {
        int arr [] ={1,0,1,1,1,0};
        int k =2;
        //int ans = countSubarraySum(arr,k);
        int ans = optimal(arr,k);
        System.out.println("Ans "+ ans);
    }

    private static int optimal(int[] arr, int k) {
        int left =0;
        int right = 0;
        int sum = 0;
        int count =0;


        while (right<arr.length){

            sum+=arr[right];

            while (sum>k){
                sum=sum-arr[left];
                left++;
            }
            count=count+(right-left+1);
            right++;

        }
        return count;
    }

    private static int countSubarraySum(int[] arr, int k) {
            int ans =0;

        for (int i = 0; i < arr.length; i++) {
            int sum =arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                sum+=arr[j];
                if (sum==k){
                    ans++;
                }
            }
        }
       return ans;
    }
}
