public class FrogJumpKDistances_TabulationDP_withSpace {
    class Solution {

        public int frogJump(int[] heights, int k) {
            int[] dp = new int[heights.length];
            dp[0] = 0;

            for(int ind = 1; ind<=heights.length-1; ind++){

                int minValue = Integer.MAX_VALUE;

                for(int j = 1; j<=k; j++){
                    if(ind-j>=0){
                        int value = dp[ind-j] + Math.abs(heights[ind]-heights[ind-j]);
                        minValue = Math.min(minValue,value);
                    }
                    else break;
                }

                dp[ind] = minValue;
            }
            return dp[heights.length-1];
        }
    }
}
