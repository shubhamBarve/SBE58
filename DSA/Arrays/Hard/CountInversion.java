package Arrays.HardProblems;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        int n = arr.length;
        //int count = CountInversionBruteForce(arr,n);
        int count = CountInversionOptimal(arr,n-1);
        System.out.println("count inversin "+count);
    }

    private static int CountInversionOptimal(int[] arr, int n) {

        return   MergeSort(arr,0,n);

    }

    private static int MergeSort(int[] arr, int low, int high) {
        int count = 0;
        if(low>=high){
            return count;
        }
        int mid = (low+high)/2;
       count+= MergeSort(arr,low,mid);
       count+= MergeSort(arr,mid+1,high);
         count+=Merge(arr,low,mid,high);
         return count;
    }

    private static int Merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
            int count =0;
        while (left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                left++;
            }else {
                count += (mid-left+1);
                right++;
            }


        }
        while (left <= mid) {

            left++;
        }
        while (right <= high) {

            right++;
        }
        return count;


    }

    private static int CountInversionBruteForce(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
