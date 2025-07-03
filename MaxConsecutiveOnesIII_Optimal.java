public class MaxConsecutiveOnesIII_Optimal {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int l = 0, r = 0;
            int cnt = 0;
            int maxlen = 0;
            while(r<nums.length){
                if(nums[r]==0) cnt++;
                if(cnt>k){
                    if(nums[l]==0) cnt--;
                    l++;
                }
                if(cnt<=k){
                    int len = r-l+1;
                    maxlen = Math.max(maxlen,len);
                }
                r++;
            }
            return maxlen;
        }
    }
}
