package Arrays;

public class Findouthowmanytimesthearrayhasbeenrotated {
    public static void main(String[] args) {
        int arr[]= {2,3,4,5,0,1};
        int rotate = arrayRoatedOptimal(arr);
        System.out.println("Array is rotated "+rotate+" times");
    }

    private static int arrayRoatedOptimal(int[] arr) {
        int low = 0,high =arr.length-1;
        int ind=0;
        int ans = Integer.MAX_VALUE;

        while (low<=high){
            int mid =(low+high)/2;

            /*if(arr[low]<arr[high]){
                ind = low;
                return ind;
            }*/

            if(arr[low]<=arr[mid]){
               // ans = Math.min(ans,arr[low]);
                if (arr[low] < ans) {
                    ind = low;
                    ans = arr[low];
                }
                low = mid + 1;
            }else {
                //ans= Math.min(ans,arr[mid]);
                if (arr[mid] < ans) {
                    ind = mid;
                    ans = arr[mid];
                }
                high  = mid-1;
            }


        }

        return ind;

    }
}
