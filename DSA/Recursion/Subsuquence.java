package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsuquence {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n =3;
        List<Integer> list = new ArrayList<>();

        f(0,n,arr,list);
    }

    private static void f(int i, int n, int[] arr, List<Integer> list) {

        if(i>=arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        f(i+1,n,arr,list);
        list.removeLast();
       // list.remove(i);
        f(i+1,n,arr,list);

    }
}
