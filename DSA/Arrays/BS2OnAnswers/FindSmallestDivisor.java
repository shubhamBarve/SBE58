package Arrays.BS2OnAnswers;

public class FindSmallestDivisor {
    public static void main(String[] args) {
        int nums[]={1,2,5,9};
        int threshold = 6;
        System.out.println("value is "+smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {

    int max= -1;
        for(int i =0;i<nums.length;i++){
        max= Math.max(max,nums[i]);


    }

    int low =1;
    int high=max;
        while(low<=high){
        int mid =(low+high)/2;

        int sum = findSum(nums,mid);
        if(sum<=threshold){
            high=mid-1;
        }else{
            low= mid+1;
        }

    }
        return low;

}
public static int findSum(int nums[],int div){
    int  sum =0;
    for(int i =0;i<nums.length;i++){
        sum += (int) Math.ceil((double) nums[i] /div);
    }return sum;
}
}
