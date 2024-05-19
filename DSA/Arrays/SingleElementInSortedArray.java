package Arrays;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = {3,3,7,7,10,11,11};
        int n = arr.length;
      //  int elem = SingelElementBruteForce(arr, n);
        int elem = SingelElementOPtimal(arr, n);
        System.out.println("Element is " + elem);
    }

    private static int SingelElementOPtimal(int[] arr, int n) {
        int elem=-1;

        int low = 0,high = n-1;
        if (n == 1) {
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }

        while (low<=high){
            int mid = (low+high)/2;

            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if((mid%2==0 && arr[mid]==arr[mid+1] )|| (mid%2==1 && arr[mid]==arr[mid-1])){
                low=mid+1;
            }else {
                high =mid-1;
            }


        }


        return 0;

    }

    private static int SingelElementBruteForce(int[] arr, int n) {
        int elem = 0;
        if (n == 1) {
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        for (int i = 1; i <n-1 ; i++) {

            if(arr[i]!=arr[i+1]&& arr[i]!=arr[i-1]){
                elem =i;
            }

        }

        return arr[elem];


    }
}