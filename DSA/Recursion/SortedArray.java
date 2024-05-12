package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        System.out.println(sortedArray(arr,0));
    }

    private static boolean sortedArray(int[] arr,int index) {

        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1] && sortedArray(arr,index+1)){
            return  true;
        }else {
            return false;
        }


    }

}
