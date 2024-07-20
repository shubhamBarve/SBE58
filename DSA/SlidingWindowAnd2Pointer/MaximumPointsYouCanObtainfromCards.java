package SlidingWindowAnd2Pointer;

public class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args) {
        int arr[] = {96,90,41,82,39,74,64,50,30};
        int k =8;
        int ans = findUsingOPtimal(arr,k);
        System.out.println("maximum "+ans);
    }
    private static int findUsingOPtimal(int[] arr,int k){
        int max=0;

        int lSum=0;
        for (int i = 0; i <k ; i++) {
            lSum = lSum+arr[i];
        }
        int rSum = 0;
        max=lSum;
        int right = arr.length-1;
        for (int i = k-1; i >=0 ; i--) {
            lSum = lSum-arr[i];
            rSum = rSum+arr[right];
          //  max=lSum+rSum;
            right--;
            max=Math.max(max,(rSum+lSum));
        }

        return max;
    }
}
