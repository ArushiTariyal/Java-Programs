public class BinarySubarraysWithSum_Optimal {
    class Solution {
        public int findcount(int[] nums, int goal){
            if(goal<0) return 0;
            int r = 0;
            int l = 0;
            int count = 0;
            int sum = 0;
            while(r<nums.length){
                sum += nums[r];
                while(sum>goal && l<nums.length){
                    sum -= nums[l];
                    l++;
                }
                if(sum<=goal){
                    count += r-l+1;
                }
                r++;
            }
            return count;
        }
        public int numSubarraysWithSum(int[] nums, int goal) {
            int first = findcount(nums,goal);
            int second = findcount(nums,goal-1);
            return first - second;
        }
    }
}
