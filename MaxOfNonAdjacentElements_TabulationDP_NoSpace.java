public class MaxOfNonAdjacentElements_TabulationDP_NoSpace {
    class Solution {

        public int nonAdjacent(int[] nums) {
            //int[] dp = new int[nums.length];

            //dp[0] = nums[0];

            int prevMax1 = nums[0];
            int prevMax2 = 0;

            for(int ind = 1; ind<nums.length; ind++){
                int pick = nums[ind];

                if(ind-2>=0) pick = nums[ind] + prevMax2;

                int notPick = prevMax1;

                int curr = Math.max(pick, notPick);

                prevMax2 = prevMax1;

                prevMax1 = curr;
            }
            return prevMax1;
        }
    }
}
