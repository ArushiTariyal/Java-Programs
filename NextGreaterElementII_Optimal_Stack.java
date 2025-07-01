import java.util.*;
public class NextGreaterElementII_Optimal_Stack {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int N = nums.length;
            Stack<Integer> st = new Stack<>();
            int[] neg = new int[N];
            for(int i=2*N-1; i>=0; i--){
                while(!st.isEmpty() && st.peek()<=nums[i%N]) st.pop();
                if(i<N){
                    neg[i] = st.isEmpty()? -1:st.peek();
                }
                st.push(nums[i%N]);
            }
            return neg;
        }
    }
}
