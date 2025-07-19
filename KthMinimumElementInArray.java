import java.util.*;
public class KthMinimumElementInArray {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    //pq is by default min heap, so it will have 1 2 3 5.
    // if we have 4 in array, we need to replace 5, not 1. But in min heap at top there will be 1
    // So in order to get 5 on top so that we can replace it, we use reverse of pq which is max heap.
    public int KthMinElement(int[] nums, int k){
        int n = nums.length;
        for(int i = 0; i<k; i++){
            pq.add(nums[i]);
        }
        for(int i = k; i<n; i++){
            if(nums[i]<pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }

        return pq.peek();
    }
}
