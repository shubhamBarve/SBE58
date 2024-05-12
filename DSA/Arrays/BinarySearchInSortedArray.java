package Arrays;

public class BinarySearchInSortedArray {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int target = -1;
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);

    }

    public static int binarySearch(int[] nums, int target, int low, int high) {
        int n = nums.length;
        if(low>high)
            return -1;
        int mid = (low+high)/2;

        if(nums[mid]==target)
            return mid;
        else if(nums[mid]<target){
           return binarySearch(nums,target,mid+1,high);
        }
          return binarySearch(nums,target,low,mid);


    }
}
