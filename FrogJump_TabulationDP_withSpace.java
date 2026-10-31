public class FrogJump_TabulationDP_withSpace {
    class Solution {
        public int frogJump(int[] heights) {
            int[] dp = new int[heights.length];

            dp[0] = 0;
            for(int i = 1; i<heights.length; i++){
                int oneStep = dp[i-1] + Math.abs(heights[i]- heights[i-1]);

                int twoStep = Integer.MAX_VALUE;

                if(i>1){
                    twoStep = dp[i-2] + Math.abs(heights[i]-heights[i-2]);
                }

                dp[i] = Math.min(oneStep,twoStep);
            }

            return dp[heights.length-1];
        }
    }
}
