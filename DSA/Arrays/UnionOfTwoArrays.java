package Arrays;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]= {6,1,1,1,2,3,4};
        int arr2[]= {5};
        HashSet<Integer> hs = new HashSet<>();
        union(arr1,arr2,hs);
        System.out.println(hs);
    }

    private static void union(int[] arr1, int[] arr2, HashSet<Integer> hs) {

        for (int i = 0; i <arr2.length ; i++) {
            hs.add(arr2[i]);
        }
        for (int i = 0; i <arr1.length ; i++) {
            hs.add(arr1[i]);
        }
    }
}
