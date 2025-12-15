import java.util.*;
public class SlidingWindowMaximum_Optimal {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            Deque<Integer> dq = new ArrayDeque<>();
            List<Integer> al = new ArrayList<>();
            int[] ans;
            int ind = 0;
            for(int i = 0; i<nums.length; i++){
                if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                    dq.pollFirst();
                }
                while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
                if(i>=k-1) al.add(nums[dq.peekFirst()]);
            }
            ans = new int[al.size()];
            for(int e: al){
                ans[ind++] = e;
            }
            return ans;
        }
    }
}
