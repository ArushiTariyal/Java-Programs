public class FrogJump_TabulationDP_NoSpace {
    class Solution {
        public int frogJump(int[] heights) {
            int prev1i = 0;
            int prev2i = 0;

            for(int i = 1; i<heights.length; i++ ){
                int oneStep = prev1i + Math.abs(heights[i] - heights[i-1]);
                int twoStep = Integer.MAX_VALUE;
                if(i>1){
                    twoStep = prev2i + Math.abs(heights[i] - heights[i-2]);
                }

                int curr = Math.min(oneStep, twoStep);

                prev2i = prev1i;
                prev1i = curr;

            }

            return prev1i;
        }
    }
}
