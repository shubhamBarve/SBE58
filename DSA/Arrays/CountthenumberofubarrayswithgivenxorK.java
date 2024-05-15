package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountthenumberofubarrayswithgivenxorK {

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorKOptimalApproach(a, k);
        System.out.println("Subarray Count"+ans);
    }

    private static int subarraysWithXorKOptimalApproach(int[] a, int k) {
        Map<Integer,Integer> hashmp = new HashMap<>();

        int count = 0;
        int xor = 0;
        hashmp.put(xor,1);

        for (int i = 0; i < a.length; i++) {
            xor = xor ^ a[i];

            int tgt = xor ^ k;


            if(hashmp.containsKey(tgt)){
                count += hashmp.get(tgt);
                hashmp.put(tgt,hashmp.get(tgt)+1);
            }else
                hashmp.put(tgt,1);

        }
        return count;

    }
}
