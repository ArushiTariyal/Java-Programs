import java.util.*;
public class NextGreaterElementI_reStack {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer,Integer> nge = new HashMap<>();
            int[] ans = new int[nums1.length];
            Stack<Integer> st = new Stack<>();
            int i = nums2.length-1;
            while(i>=0){
                while(!st.isEmpty() && st.peek()<=nums2[i]) st.pop();

                if(st.isEmpty()) nge.put(nums2[i], -1);
                else nge.put(nums2[i],st.peek());
                st.push(nums2[i]);
                i--;
            }
            for(int j = 0; j<nums1.length; j++){
                ans[j] = nge.get(nums1[j]);
            }
            return ans;

        }
    }
}
