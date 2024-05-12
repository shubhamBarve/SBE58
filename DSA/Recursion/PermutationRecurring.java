package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationRecurring {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean []freq = new boolean[arr.length];
        //recurPermutation(arr,ds,ans,freq);

        recurPermute2(0,arr,ans);
        System.out.println(ans);

    }

    private static void recurPermute2(int i, int[] arr, List<List<Integer>> ans) {

        if(i==arr.length){
            List<Integer> ds = new ArrayList<>();

            for(int j = 0; j <arr.length; j++){
                ds.add(arr[j]);

            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int j=i;j<arr.length;j++){
            swap(j,i,arr);
            recurPermute2(i+1,arr,ans);
            swap(j,i,arr);
        }
    }

    private static void swap(int j, int i, int[] arr) {

        int temp =arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


    private static void recurPermutation(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {


        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i<arr.length;i++){
            if(!freq[i]){
                freq[i]= true;
                ds.add(arr[i]);
                recurPermutation(arr,ds,ans,freq);
                ds.removeLast();
                freq[i]=false;
            }

        }




    }
}
