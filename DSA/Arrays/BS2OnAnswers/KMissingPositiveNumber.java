package Arrays.BS2OnAnswers;

public class KMissingPositiveNumber {

    public static void main(String[] args) {
    int arr[] ={5,6};
            System.out.println(optimal(arr,4));
    }


    static public int findKthPositive(int[] arr, int k) {
        int miss[]= new int[1001];
        int ind=1;
        for (int i = 1; i <=1000 ; i++) {
            int flag=0;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                miss[ind++]=i;
            }

        }

        return miss[k];
    }

    static public int bruteForce(int [] arr,int k){

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<=k){
                k++;
            }else break;
        }return k;


    }

    static public int optimal(int [] arr,int k){

        int low =0;
        int high=arr.length-1;
        while (low<=high) {
            int mid = (low + high) / 2;
            int miss = arr[mid] - (mid + 1);
            if (miss < k) {
                low = mid + 1;

            } else high = mid - 1;
        }
    return low+k;
 }

}
