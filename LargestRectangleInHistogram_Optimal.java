import java.util.*;
public class LargestRectangleInHistogram_Optimal {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            Stack<Integer> st = new Stack<>();
            int max = -1;
            for(int i = 0; i<heights.length; i++){
                while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                    int val = heights[st.pop()];
                    int pse = st.isEmpty()? -1 : st.peek();
                    int nse = i;
                    max = Math.max(max, val*(nse-pse-1));
                }
                st.push(i);
            }
            while(!st.isEmpty()){
                int val = heights[st.pop()];
                int nse = heights.length;
                int pse = st.isEmpty()? -1: st.peek();
                max = Math.max(max, val*(nse-pse-1));
            }
            return max;
        }
    }
}
