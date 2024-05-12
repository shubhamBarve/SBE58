package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1, 2, 1};
        //Brute Force Method
        //int ans = majorityElementBruteForece(arr);
       // System.out.println("Majority Element : " +ans);

        //BetterApproach
       /* int ans = majorityElementBetterApproach(arr);
        System.out.println("Majority Element : " +ans);*/


        //Optimized approach
        // Find the element and it count if it appears second time then increase the count
         // and if not reduce the count
        //
        int ans = majorityElementOPtimizedApproach(arr);
        System.out.println("Majority Element : " +ans);

    }

    private static int majorityElementOPtimizedApproach(int[] arr) {
        int element=0;
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            if(count==0){
                element =arr[i];
                count++;
            }else if (element == arr[i]){
                count++;
            }
            else count--;
        }
        count =0;
        for (int i = 0; i < arr.length; i++) {
            if(element==arr[i]){
                count++;
            }
        }
        if(count>arr.length/2){
            return element;
        }
        return -1;
    }

    private static int majorityElementBetterApproach(int[] arr) {
        int n = arr.length;

        HashMap<Integer,Integer> map =new HashMap<>();

        for (int i = 0; i < n; i++) {
            /*int value = map.getOrDefault(arr[i],0);
            System.out.println(value);
            map.put(arr[i],value+1);*/

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }

        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }

    private static int majorityElementBruteForece(int[] arr) {

        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (j == k) {
                    count++;
                }
            }

            if (count > (arr.length / 2)) {
                return j;
            }
        }

        return -1;


    }
}
