package SlidingWindowAnd2Pointer;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,0,0 ,1,1,1};
        int k =2;
        int anss = maxConecutiveOne(arr,k);
        System.out.println("Consecutive one"+anss);
        System.out.println(longestOnes(arr,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int currWind= 0;
        int numZeroes=0;
        int l=0;
        int r=0;

        for (int i = 0; i <nums.length ; i++) {

            if(nums[i]==0){
                numZeroes++;
            }
            while (numZeroes>k){

                if(nums[l]==0){
                    numZeroes--;
                }l++;

            }
            int wind= i-l+1;
            currWind=Math.max(wind,currWind);

        }
        
        
        return currWind;
    }
    private static int maxConecutiveOne(int[] arr, int k) {
        int maxlength = 0;
        int left=0,right=0;
        int zeroes = 0;
        int length=0;
        while (right<arr.length){
            if(arr[right]==0){
                zeroes++;
            }
            while (zeroes>k){
                if (arr[left]==0) zeroes--;
                left++;
            }
            if(zeroes<=k){
                length = right-left+1;
                maxlength=Math.max(maxlength,length);
            }
            right++;


        }



                return maxlength;


    }


}


