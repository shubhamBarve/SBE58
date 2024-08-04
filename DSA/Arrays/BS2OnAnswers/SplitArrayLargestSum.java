package Arrays.BS2OnAnswers;

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int []arr = {7,2,5,10,8};
        int k=2;
        System.out.println("Answer ; "+splitLargestSum(arr,k));
    }

    private static int splitLargestSum(int[] arr, int k) {
        int low=0;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            low=Math.max(low,arr[i]);

        }
//optimal

        int high =sum;
        while (low<=high){
            int mid = (low+high)/2;

            if(findAnswers(arr,mid)>k){
                low=mid+1;
            }else high=mid-1;

        }return low;


/*
        for (int i = low; i <=sum ; i++) {

            if(findAnswers(arr,i)<=k){
                return i;
            }

        }
*/
        //return -1;
    }

    private static int findAnswers(int[] arr, int max) {
        int subarr=1;
        int capacity=0;
        for (int j = 0; j < arr.length; j++) {
            if(capacity+arr[j]<=max){
                capacity+=arr[j];
            }else {
                capacity=arr[j];
                subarr++;
            }
        }
return subarr;
    }
}
