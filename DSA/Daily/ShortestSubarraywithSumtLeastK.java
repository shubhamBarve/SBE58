package Daily;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ShortestSubarraywithSumtLeastK {
    public static void main(String[] args) {
           int nums[]= {1};
           int k = 1;
        System.out.println(optimal(nums,k));
    }
    public static int shortestSubarray(int[] nums, int k) {
        int currWindow = Integer.MAX_VALUE;
        int sum =0;
        int left = 0;

        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];

            while (sum>=k ){
                currWindow = Math.min(currWindow,i-left+1);

                    sum -= nums[left];

                left++;
            }
        }

        return currWindow==Integer.MAX_VALUE?-1:currWindow;
    }

    public static int optimal(int []nums,int k){
        int shortest = Integer.MAX_VALUE;  // To keep track of the shortest subarray length
        int n = nums.length;

        // Create a prefix sum array where prefixSum[i] gives the sum of the first i elements.
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];  // Cumulative sum for each element
        }

        // Use a deque to maintain the indices of the prefixSum array
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n + 1; i++) {
            // Check if the current subarray sum meets the condition (sum >= k)
            while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {
                shortest = Math.min(shortest, i - deque.pollFirst());  // Update shortest subarray length
            }

            // Maintain the monotonic property of the deque: remove elements from the back if they have higher prefix sums
            while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add the current index to the deque
            deque.addLast(i);
        }

        // If no valid subarray was found, return -1, else return the shortest length found
        return shortest == Integer.MAX_VALUE ? -1 : shortest;
    }
}
