package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        selectionSort(arr,arr.length);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static void selectionSort(int[] arr, int length) {
        int mini;
        for (int i = 0; i <arr.length ; i++) {

            mini=i;
            for (int j = i+1; j <length ; j++) {
                if(arr[j]<arr[mini]){
                    mini=j;
                }

            }
            int temp =arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;


        }

    }
}
