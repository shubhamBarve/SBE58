package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n= arr.length;
        bubbleSort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr, int n) {
        for (int i =n-1;i>=0;i--){
            for (int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

    }
}
