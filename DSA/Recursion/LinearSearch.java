package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {5,7,6,1};

        System.out.println(linearSearch( arr,0,5));
    }

    private static int linearSearch(int[] arr, int i,int target) {
    if( i == arr.length){
        return -1;
    }
    if(arr[i]== target){
        return  i;
    }else {
         return linearSearch(arr,i+1,target);
    }

    }
}
