package Arrays;

public class SearchInsertedElementIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }

    private static int searchInsert(int[] arr, int x) {
            int ans =arr.length;
            int low = 0;
            int high = arr.length-1;
                while (low<=high){
                    int mid = (low+high)/2;

                    if(arr[mid]>=x){
                        ans= mid;
                        high=mid-1;
                    }else{
                        low= mid+1;
                    }


                }
                return ans;
    }
}
