package Strings;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums []= {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }
    public static int[]  productExceptSelf(int[] nums) {
        int ans [] = new int[nums.length];
        int left [] = new int[nums.length];
        int right [] = new int[nums.length];
        for (int i = 0; i < nums.length ;i++) {
            int prod = 1;
            for (int j = i+1; j < nums.length ; j++) {
                prod = prod*nums[j];

            }
            left[i]=prod;
        }

        for (int i = 0; i < nums.length ;i++) {
            int prod = 1;
            for (int j = 0; j < i ; j++) {
                prod = prod*nums[j];

            }
            right[i]=prod;
        }
        for (int i = 0; i <nums.length ; i++) {
            ans[i]=right[i]*left[i];
        }
        return  ans;
    }
    public static int[]  productExceptSelf2(int[] nums) {
        int []left=new int[nums.length];
        left[0]=1;
        for (int i = 1; i <nums.length ; i++) {
            left[i]=left[i-1]*nums[i-1];

        }
        int right=1;
        for (int i = nums.length-1; i  >=0; i--) {

            left[i]=left[i]*right;
            right=right*nums[i];
        }


        return left;
    }

}
