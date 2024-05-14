package Arrays;

public class CountOccurrencesinSortedArray {
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 1;
        //int ans = countBruteForce(arr, n, x);
        int ans = countOptimalApproach(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);

    }

    private static int countOptimalApproach(int[] arr, int n, int x) {
        int ans[] = findFirstAndLastOccurence(arr,n,x);
        if(ans[0]==-1) return 0;
        return ans[1] - ans[0]+1;
    }

    private static int[] findFirstAndLastOccurence(int[] arr, int n, int x) {

        int first = firstOccur(arr,n,x);

        int last = lastOccur(arr,n,x);

        return new int[] {first,last};
    }

    private static int lastOccur(int[] arr, int n, int x) {
        int low = 0;
        int high = n-1;
        int last=-1;
            while (low<high){
                int mid = (low+high)/2;

                if(arr[mid]==x){
                    last= mid;
                    low=mid+1;
                } else if (arr[mid]>x) {
                    high = mid-1;

                }else {
                    low = mid+1;
                }
            }
    return last;
    }

    private static int firstOccur(int[] arr, int n, int x) {
        int low = 0;
        int high = n-1;
        int first=-1;
        while (low<high){
            int mid = (low+high)/2;

            if(arr[mid]==x){
                first= mid;
                high = mid-1;
            }else if (arr[mid]>x){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return first;

    }
    private static int countBruteForce(int[] arr, int n, int x) {
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==x){
                count++;
            }
        }


        return count;

    }
}
