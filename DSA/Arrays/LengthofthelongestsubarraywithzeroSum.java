package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthofthelongestsubarraywithzeroSum {
    public static void main(String[] args) {
        {
            int a[] = {9, -3, 3, -1, 6, -5,-9};
            // sint ans = findSubarryBruteForce(a);
            int ans = findSubarryOptimalApproach(a);
            System.out.println(ans);
        }
    }

    private static int findSubarryOptimalApproach(int[] arr) {
            Map<Integer,Integer> hashmap = new HashMap<>();
            int max=0;
            int sum =0;

        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];


            if (sum==0){
                max= i+1;

            } else {

                if (hashmap.get(sum)!=null) {
                    max = Math.max(max,i- hashmap.get(sum));


                }else {
                    hashmap.put(sum,i);
                }
            }



        }
return max;
    }

    private static int findSubarryBruteForce(int[] arr) {

        int n = arr.length;

        int max = 0;
        for (int i = 0; i <n ; i++) {
            int sum =0;
            for (int j = i+1; j < n; j++) {
                sum = sum+arr[j];

                if(arr[i]+sum==0){
                    max = Math.max(max,j-i+1);
                }

            }
        }

        return max;
    }
}
