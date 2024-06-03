package Arrays.BS2OnAnswers;

public class MinimumdaystomakeMbouquets {
    public static void main(String[] args) {
        int arr[]={1,10,3,10,2};
        System.out.println("output days "+minDays(arr,3,2));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        int n = bloomDay.length; // Size of the array
        if (val > n) return -1;
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }

        int low = min;
        int high = max;
        while(low<=high){
            int mid = (low+high)/2;

            if(isPossible(bloomDay,m,k,mid)){
                high=mid-1;
            }else{
                low = mid+1;
            }

        }
        return low;


    }
    public static boolean isPossible(int bloomDay[],int m,int k,int mid){
        int count =0;
        int book=0;
        for(int i =0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }else{
                book+=(count/k);
                count=0;
            }
        }
        book+=(count/k);
        if(book>=m){
            return true;
        }

        return false;
    }
}
