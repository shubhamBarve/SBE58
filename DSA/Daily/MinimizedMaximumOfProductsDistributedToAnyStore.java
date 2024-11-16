package Daily;

public class MinimizedMaximumOfProductsDistributedToAnyStore {
    //https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/?envType=daily-question&envId=2024-11-14

    public static void main(String[] args) {
        int  n = 7;
        int []quantities = {15,10,10};
        System.out.println(minimizedMaximum(n,quantities));
        System.out.println(optimal(n,quantities));
    }

    public static int optimal(int n,int [] quantities){
        int low =1;
        int high=Integer.MIN_VALUE;
        for (int i = 0; i < quantities.length; i++) {
            high = Math.max(high,quantities[i]);
        }

        while (low<=high) {

            int mid = (low+high)/2;

            int count= calculateCount(quantities,mid);

            if(count<=n){
                    high =mid-1;
            }else{
                low = mid+1;
            }

        }
        return low;

    }

    private static int calculateCount(int[] quantities, int mid) {
        int ans=0;
        for (int j = 0; j < quantities.length; j++) {
            int count =(quantities[j]+mid-1)/mid;

            ans +=count;


        }
        return ans;


    }

    public static int minimizedMaximum(int n, int[] quantities) {
        //


        int k=1;
        while(true){
            int  ans = 0;
            for (int j = 0; j < quantities.length; j++) {
                int count =(quantities[j]+k-1)/k;

                ans +=count;


            }
            if(ans<=n){
                return k;
            }
            k++;

        }

    }
}
