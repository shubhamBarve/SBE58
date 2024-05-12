package Arrays;

public class LeftRotateByoneIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        //3,2,1,4,5,6,7
        //3,2,1,7,6,5,4
        //4,5,6,7,1,2,3
        //leftrotate(arr);


        leftrotateByD(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
    }

    private static void leftrotateByD(int[] arr) {
        reverse(arr,0,2);
        reverse(arr,3,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

    private static void leftrotate(int[] arr) {
        int temp =arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }
}
