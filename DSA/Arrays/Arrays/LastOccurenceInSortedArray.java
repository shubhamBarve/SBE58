package Arrays;

public class LastOccurenceInSortedArray {

    public static void main(String[] args) {
        int n = 7;
        int key = 1;
        int[] v = {3,4,13,13,14,20,40};

        // returning the last occurrence index if the element is present otherwise -1
        System.out.println(solve(n, key, v));
    }

    private static int solve(int n, int key, int[] arr) {
        //{3,4,13,13,13,20,40};
        int ans =-1;
        int low =0,high =n-1;

        while (low<=high){
            int mid =(low+high)/2;

            if(arr[mid]<=key){
                ans= mid;
                low = mid+1;
            }else high= mid-1;

        }
        return ans;
    }
}
