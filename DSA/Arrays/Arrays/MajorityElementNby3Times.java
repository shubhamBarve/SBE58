package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNby3Times {
    public static void main(String[] args) {
        int[] arr = {121, 33, 33, 11, 33, 11};
        //List<Integer> ans = majorityElementBruteForce(arr);
        //List<Integer> ans = majorityElementBetterApproach(arr);
        List<Integer> ans = majorityElementOptimalApproach(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    private static List<Integer> majorityElementOptimalApproach(int[] arr) {
        int elem1 =Integer.MIN_VALUE,count1=0,elem2=Integer.MIN_VALUE,count2=0;
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            if(count1==0 && elem2!=arr[i]){
                count1++;
                elem1 = arr[i];
            } else if (count2==0 && elem1!=arr[i]) {
                count2++;
                elem2 = arr[i];

            } else if (elem1 == arr[i]) {
                count1++;

            } else if (elem2 == arr[i]) {
                count2++;


            }
            else {
                count2--;
                count1--;
            }
        }
        List<Integer> list = new ArrayList<>();
         count1 =0;
         count2=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==elem1){
                count1++;
            }
            if(arr[i]==elem2){
                count2++;
            }
        }
        if(count1>n/3){
            list.add(elem1);
        }
        if(count2>n/3){
            list.add(elem2);
        }
        return list;
    }

    private static List<Integer> majorityElementBetterApproach(int[] arr) {
        Map<Integer,Integer> ans = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            int value = ans.getOrDefault(arr[i],0);
            ans.put(arr[i], value + 1);

        }
        for(Map.Entry<Integer,Integer> entry : ans.entrySet()){
            if(entry.getValue()>n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    private static List<Integer> majorityElementBruteForce(int[] arr) {

        List <Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/3 && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
    }


}
