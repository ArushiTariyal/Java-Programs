import java.util.*;
public class NextGreaterElement_Stack {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int max = Integer.MIN_VALUE;
            Map<Integer, Integer> nge = new HashMap<>();
            Stack<Integer> st = new Stack<>();
            int i = nums2.length - 1;
            while (i >= 0) {
                while (!st.isEmpty() && st.peek() <= nums2[i]) {
                    st.pop();
                }
                if (st.isEmpty()) nge.put(nums2[i], -1);
                else nge.put(nums2[i], st.peek());
                st.push(nums2[i]);
                i--;
            }
            int nums[] = new int[nums1.length];
            for (int j = 0; j < nums1.length; j++) {
                nums[j] = nge.get(nums1[j]);
            }
            return nums;
        }
    }
}
