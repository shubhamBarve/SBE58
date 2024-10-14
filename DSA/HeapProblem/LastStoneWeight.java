package HeapProblem;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int stones[] = {6,6};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
    int ans = 0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }



        while (maxHeap.size()>1){

            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();


            if(stone1!=stone2){
                maxHeap.add(stone1-stone2);
            }

            System.out.println(maxHeap);

        }


    if(maxHeap.size()==0){
        return 0;
    }
    return maxHeap.peek();
    }
}
