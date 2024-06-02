package Arrays;

public class CountMaximumConsecutiveOnesinthearray {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,1,1};
        int n = arr.length;
        int count = findConsecutiveOneBrute(arr,n);
        System.out.println("Consecutive one "+count);
    }
    private static int findConsecutiveOneBrute(int[] arr, int n) {

        int count =0;
        int temp=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                temp++;
            }
            if(arr[i]!=1){
                count = Math.max(count,temp);
                temp=0;
            }
        }
        count = Math.max(count,temp);
        return count;
    }
}
