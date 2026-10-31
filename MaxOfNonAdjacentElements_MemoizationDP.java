import java.util.Arrays;

public class MaxOfNonAdjacentElements_MemoizationDP {
    class Solution {
        public int nonAdjRecur(int[] nums, int ind, int[] dp){
            if(ind==0) return nums[0];

            if(dp[ind]!= -1) return dp[ind];

            int pick = nums[ind];

            if(ind-2>=0) pick = nums[ind] + nonAdjRecur(nums, ind-2, dp);

            int notPick = nonAdjRecur(nums, ind-1,dp);


            return dp[ind] = Math.max(pick,notPick);
        }
        public int nonAdjacent(int[] nums) {
            int[] dp = new int[nums.length];
            Arrays.fill(dp,-1);
            return nonAdjRecur(nums, nums.length-1, dp);
        }
    }
}
