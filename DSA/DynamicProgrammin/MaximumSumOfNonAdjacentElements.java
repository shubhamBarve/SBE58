package DynamicProgramming;

public class MaximumSumOfNonAdjacentElements {
    public static void main(String[] args) {
        int arr[] = {2,7,9,3,1};
        int n =arr.length;
        System.out.println(ansUsingDP(arr,n));
    }

    private static int ansUsingDP(int[] arr, int n) {
        int prev=arr[0];
        int curr=0;
        for (int i = 1; i <n ; i++) {
            int consider = arr[i];
            if(i>1){
                consider=consider+curr;
            }
            int noConsider = 0+prev;
            int now = Math.max(consider,noConsider);

            curr = prev;
            prev = now;

        }
        return  prev;

    }
}
