public class JumpGame_Greedy_Reprised {
    class Solution {
        public boolean canJump(int[] nums) {
            int maxIndexReached = 0;

            for(int i = 0; i<nums.length; i++){
                if(nums[i] + i > maxIndexReached){
                    if(i <= maxIndexReached){
                        maxIndexReached = nums[i]+i;
                    }
                    else return false;
                }

            }

            return maxIndexReached >= nums.length-1;
        }
    }
}
