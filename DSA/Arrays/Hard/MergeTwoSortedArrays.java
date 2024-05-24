package Arrays.HardProblems;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10,0,0,0};
        long[] arr2 = {2, 3, 9};

        int m = 4, n = 3;
        merge(arr1, arr2, m, n);
        System.out.print("arr1[] = ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void merge(long nums1[],long nums2[],int m,int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--]=nums2[j--];
        }
    }





}

