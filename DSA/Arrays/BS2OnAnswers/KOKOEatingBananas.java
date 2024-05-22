package Arrays.BS2OnAnswers;

import java.util.Arrays;

public class KOKOEatingBananas {
    public static void main(String[] args) {
        int[] v = {3,6,7,11};
        int h = 8;
       //int ans = minimumRateToEatBananasBruteForce(v, h);
        int ans = minimumRateToEatBananasOptimal(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }

    private static int minimumRateToEatBananasOptimal(int[] arr, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }

        int low = 1;
        int high = max;

        while (low<=high){
            int mid = (low+high)/2;
            double totalHrs=0;
            totalHrs = calculateHours(arr,mid);
            if(totalHrs<=h){
                high = mid-1;
            }else {
                low = mid+1;
            }

        }return low;

    }

    private static double calculateHours(int[] arr, int h) {
        double total =0;
        for (int i = 0; i < arr.length; i++) {
            total = total+Math.ceil((double) arr[i] /h);
        }
        return total;
    }

    private static int minimumRateToEatBananasBruteForce(int[]arr, int h) {
        int count=0;

        //{7, 15, 6, 3};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int min = Integer.MAX_VALUE;
        int sum =0;
        for (int i = 1; i <=max ; i++) {
            count =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]%i==0){
                    count+=(arr[j]/i);

                }else {
                    count +=(arr[j]/i)+1;

                }


            }
            if(count<=h){
                return i;
            }

        }
return min;
    }
}
