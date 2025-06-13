import java.util.Stack;
public class NextGreaterElementII_Stack {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length*2;
            int[] ans = new int[nums.length];
            Stack<Integer> st = new Stack<>();
            for(int i = n-1; i>=0; i--){
                while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                    st.pop();
                }
                if(i<nums.length){
                    if(st.isEmpty()) ans[i] = -1;
                    else ans[i] = st.peek();
                }
                st.push(nums[i%nums.length]);
            }
            return ans;
        }
    }
}
