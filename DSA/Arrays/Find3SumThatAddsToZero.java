package Arrays;

import java.util.*;

public class Find3SumThatAddsToZero {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
       // List<List<Integer>> list = tripletBruteForce(n, arr);
      //  List<List<Integer>> list = tripletBetterApproach(n, arr);
        List<List<Integer>> list = tripletOptimalApproach(n, arr);
        for (List<Integer> ans : list){
            System.out.println(ans);
        }
    }

    private static List<List<Integer>> tripletOptimalApproach(int n, int[] arr) {
            List<List<Integer>> myAns = new ArrayList<>();
            Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
            if(i!=0 && arr[i]==arr[i-1]) {
                continue;
            }
            int j = i+1,k=n-1;

            while (j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;
                }
                else if (sum<0) {
                    j++;
                }
                else {
                    List<Integer> list =  Arrays.asList(arr[i],arr[j],arr[k]);
                   myAns.add(list);
                    j++;
                    k--;
                    while (j<k && arr[j]==arr[j-1])j++;
                    while (j<k && arr[k]==arr[k+1])k--;

                }

            }


        }
        return myAns;

    }

    private static List<List<Integer>> tripletBetterApproach(int n, int[] arr) {

            HashSet<List<Integer>> temp = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i+1; j <n ; j++) {
                    int third = -(arr[i]+arr[j]);

                        if (hashset.contains(third)){
                            List<Integer> ls = Arrays.asList(arr[i],arr[j],third);
                            ls.sort(null);
                            temp.add(ls);

                        }
                        hashset.add(arr[j]);

            }
        }
        List<List<Integer>> ans = new ArrayList<>(temp);
            return ans;


    }

    private static List<List<Integer>> tripletBruteForce(int n, int[] arr) {
            Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
       return ans;
    }
}
