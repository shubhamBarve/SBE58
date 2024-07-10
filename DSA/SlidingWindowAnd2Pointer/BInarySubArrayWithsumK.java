package SlidingWindowAnd2Pointer;

public class BInarySubArrayWithsumK {
    public static void main(String[] args) {
        int arr [] ={1,0,1,0,1,0};
        int k =2;
        int ans = countSubarraySum(arr,k);
        System.out.println("Ans "+ ans);
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
