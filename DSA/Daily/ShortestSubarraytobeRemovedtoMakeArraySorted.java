package Daily;

public class ShortestSubarraytobeRemovedtoMakeArraySorted {

    //https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/description/?envType=daily-question&envId=2024-11-15

    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        System.out.println(findLengthOfShortestSubarray(arr));
    }

    public static int findLengthOfShortestSubarray(int[] arr) {

        int n= arr.length;
        int right=n-1;
        while ( right>0 && arr[right-1]<=arr[right] ){

            right--;
        }


        int left =0;



        int shortest = right;
        if(shortest==0){
            return shortest;
        }
        while (left<right){
            while (right<n && arr[left]>arr[right]){
                right++;
            }
            shortest = Math.min(shortest,right-left-1);
            left++;
            if(arr[left]<arr[left-1]){
                break;
            }
        }

        return shortest;
    }
}
