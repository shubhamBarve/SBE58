package DynamicProgramming;

import java.util.Arrays;

public class ClimbingFrog {
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50 };
        int dp[]= new int[arr.length];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(ansUsingdynamicProgrammin(arr,dp));
        System.out.println(ans(arr,arr.length-1));
    }

    private static int ans(int[] arr,int ind) {
        //this is recursion
       int left = Integer.MAX_VALUE;
       int right = Integer.MAX_VALUE;

        if(ind==0) return 0;

        left=ans(arr,ind-1)+Math.abs(arr[ind]-arr[ind-1]);

        if(ind>1){
            right = ans(arr,ind-2)+Math.abs(arr[ind]-arr[ind-2]);
        }
    return Math.min(right,left);

    }


   static private int ansUsingdynamicProgrammin(int[] arr,int[]dp){

        int left=0;
        int right=Integer.MAX_VALUE;
       for (int i = 1; i < arr.length; i++) {
           left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
           if(i>1){
               right=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
           }
           dp[i]=Math.min(left,right);
       }
       return dp[dp.length-1];


    }
}
