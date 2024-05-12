package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    //Every elemetn at right should be small
    public static void main(String[] args) {
        int arr[]= {10,22,12,3,0,6};//

        int n = arr.length;

        //Brute Force Method
       // leadersinArraYBrutForce(arr,n);
        
        
        //optimal approach
        // We need to find the maximum element frm right and check with the i th indec
        List<Integer> ans = new ArrayList<>();
      ans =  leadersinArraYOptimal(arr,n);
        System.out.println(ans);
        
    }
    //{10,22,12,3,0,6}
    private static ArrayList leadersinArraYOptimal(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
            for (int i = n-1;i>=0;i--){
                if(arr[i]>max){
                    max = arr[i];
                    ans.add(arr[i]);
                }
            }
            return ans;

    }

    //{10,22,12,3,0,6}
    private static void leadersinArraYBrutForce(int[] arr, int n) {


        for (int i = 0; i <arr.length ; i++) {
            boolean leader= true;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if (leader){
                System.out.println(arr[i]);
            }

        }
    }
}
