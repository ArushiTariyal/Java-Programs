public class JumpGame2_Recursion {
    class Solution {

        public int findMinJumps(int ind, int jumps, int[] nums, int mini){
            if(ind == nums.length-1) return jumps;

            if(ind > nums.length -1) return jumps;

            for(int i = 1; i<=nums[ind]; i++){
                mini = Math.min(findMinJumps(ind+i, jumps+1, nums, mini), mini);

            }

            return mini;
        }
        public int jump(int[] nums) {
            return findMinJumps(0,0,nums,Integer.MAX_VALUE);
        }
    }
}
