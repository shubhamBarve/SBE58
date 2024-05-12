package Arrays;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 19};
        int n = 5, x = 7;
        //int ind = lowerBoundBruteForce(arr, n, x);
        int ind = lowerBoundOptimal(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }

    private static int lowerBoundOptimal(int[] arr, int n, int x) {

        int ans =n;
        int low =0,high =n-1;


        while (low<=high){

            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans =mid;
                high = mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;


    }

    private static int lowerBoundBruteForce(int[] arr, int n, int x) {
        int ind=0;
        for (int i = 0; i <n ; i++) {
            if(x<=arr[i]){
                ind = i;
                break;
            }
        }


        return arr[ind];



    }
}
