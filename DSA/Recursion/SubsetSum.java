package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        int arr[]= {3,1,2};
        int sum=0;
        subsetSum(0,sum,arr,ds);
        Collections.sort(ds);
        System.out.println(ds);
    }

    private static void subsetSum(int i, int sum, int[] arr, ArrayList<Integer> ds) {

        if(i==arr.length){
            ds.add(sum);

            return;
        }

        subsetSum(i+1,sum+arr[i],arr,ds);

        subsetSum(i+1,sum,arr,ds);
    }


}
