package Arrays;

public class MinimuminRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,1};
        int ans = findMinBetterApproach(arr);
        System.out.println("The minimum element is: " + ans );
    }

    private static int findMinBetterApproach(int[] arr) {
        int ans =Integer.MAX_VALUE;

        int low = 0;
        int high = arr.length-1;


        while (low<=high){
            int mid = (low+high)/2;


            if(arr[low]<=arr[mid]){
                ans = Integer.min(ans,arr[low]);

                low = mid+1;
            }
            else {
                ans = Integer.min(ans,arr[mid]);
                high = mid-1;
            }


        }


        return ans;

    }
}
