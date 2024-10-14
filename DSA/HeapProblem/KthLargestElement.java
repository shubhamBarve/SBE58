package HeapProblem;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        int []nums = {3,2,3,1,2,4,5,5,6} ;
        int k = 4;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i <nums.length ; i++) {
            maxHeap.add(nums[i]);
        }
        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();






    }
}
