public class CountNumberOfNiceSubarrays_Optimal {
    class Solution {
        public int findOddNums(int[] nums, int k){
            if(k<0) return 0;
            int r = 0, l = 0, odd = 0, count = 0;
            while(r<nums.length){
                odd += (nums[r]%2);
                while(odd>k){
                    odd -= (nums[l]%2);
                    l++;
                }
                if(odd<=k) count += r-l+1;
                r++;
            }
            return count;
        }
        public int numberOfSubarrays(int[] nums, int k) {
            int first = findOddNums(nums,k);
            int second = findOddNums(nums,k-1);
            return first-second;
        }
    }
}
