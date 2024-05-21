package Arrays;

public class PeakelementinArray {
    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int n = arr.length;
        int elem = peakElementOPtimal(arr, n);
        System.out.println("Peaak Element is " + elem);
    }

    private static int peakElementOPtimal(int[] arr, int n) {
        int elem = -1;

        int low = 1;
        int high = n - 2;
        if (n == 1) {
            return 0;
        }
        if (arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return elem;


    }
}
