public class MaxConsecutiveOnesIII_Brute {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int maxlen = 0;
            int count = 0;
            for(int i = 0; i<nums.length; i++){
                count = 0;
                for(int j = i; j<nums.length; j++){
                    if(nums[j]==0){
                        count++;
                    }
                    if(count>k) break;
                    else{
                        int len = j-i+1;
                        maxlen = Math.max(maxlen,len);
                    }
                }
            }
            return maxlen;
        }
    }
}
