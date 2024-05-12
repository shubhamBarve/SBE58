package Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }

    private static int maxProfit(int[] arr) {
        int maxpro=0;
        int minBuy=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            minBuy = Math.min(arr[i],minBuy);
            maxpro = Math.max(maxpro,arr[i]-minBuy);
        }
        return maxpro;
    }

}
