package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 55;
        //Brute
        //System.out.println(twoSum(arr,n,target));

        //Better Variant
       // System.out.println(twoSumBetter(arr,n,target));

        //Optimized Way
        System.out.println(twoSumOptimized(arr,n,target));
    }

    private static boolean twoSumOptimized(int[] arr, int n, int target) {
        Arrays.sort(arr);

        int left = 0,right = n-1;

        while (left<right){
                int sum = arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if (sum<target){
                left++;
            }
            else right--;


        }

        return false;

    }

    private static boolean twoSumBetter(int[] arr, int n, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
                int num = target-arr[i];

                if (map.containsKey(num)){
                    return true;
                }
                map.put(arr[i],i);



        }



        return false;
    }

    private static boolean twoSum(int[] arr, int n, int target) {

        for (int i = 0; i <arr.length ; i++) {
            //int sum = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(target==arr[i]+arr[j]){
                    return true;
                }
            }

        }
        return false;
    }
}
