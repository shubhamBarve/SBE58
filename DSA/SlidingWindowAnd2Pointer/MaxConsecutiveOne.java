package SlidingWindowAnd2Pointer;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,0,0 ,1,1,1};
        int k =2;
        int anss = maxConecutiveOne(arr,k);
        System.out.println("Consecutive one"+anss);
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


