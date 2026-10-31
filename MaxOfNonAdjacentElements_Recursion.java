public class MaxOfNonAdjacentElements_Recursion {
    class Solution {
        public int nonAdjRecur(int[] nums, int ind){
            if(ind==0) return nums[0];

            int pick = nums[ind];

            if(ind-2>=0) pick = nums[ind] + nonAdjRecur(nums, ind-2);

            int notPick = nonAdjRecur(nums, ind-1);


            return Math.max(pick,notPick);
        }
        public int nonAdjacent(int[] nums) {
            return nonAdjRecur(nums, nums.length-1);
        }
    }
}
