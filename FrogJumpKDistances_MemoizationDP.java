import java.util.Arrays;

public class FrogJumpKDistances_MemoizationDP {
    class Solution {
        public int frogJumpDP(int[] heights, int[] dp, int ind, int k){
            if(ind ==0) return 0;

            if(dp[ind]!=-1) return dp[ind];

            int minValue = Integer.MAX_VALUE;

            for(int j = 1; j<=k; j++){
                if(ind-j>=0){
                    int value = frogJumpDP(heights, dp, ind-j, k) + Math.abs(heights[ind]-heights[ind-j]);
                    minValue = Math.min(minValue,value);
                }
                else break;
            }


            return dp[ind] = minValue;
        }
        public int frogJump(int[] heights, int k) {
            int[] dp = new int[heights.length];
            Arrays.fill(dp,-1);

            return frogJumpDP(heights, dp, heights.length-1, k);
        }
    }
}
