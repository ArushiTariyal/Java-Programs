import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement_Heap_PQ {
    class Solution {
        public int kthLargestElement(int[] nums, int k) {
            PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

            for(int num : nums){
                maxheap.add(num);
                if(maxheap.size()>k){
                    maxheap.poll();
                }
            }
            return maxheap.peek();


        }
    }
}
