public class SplitArrayLargestSum_Optimal{
    class Solution {
        public int splitArray(int[] nums, int k) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0; i<nums.length; i++){
                max = Math.max(max,nums[i]);
                sum += nums[i];
            }
            int low = max, high = sum;
            while(low<=high){
                int mid = low+ (high-low)/2;
                if(subarrayCount(nums,mid,k)<=k) high = mid-1;
                else low = mid+1;
            }
            return low;
        }
        public static int subarrayCount(int[] nums, int target, int subarrays){
            int count = 1, sum = 0;
            for(int i = 0; i<nums.length; i++){
                if(sum+nums[i]<=target){
                    sum += nums[i];
                }
                else{
                    count++;
                    sum = nums[i];
                }
            }
            return count;
        }
    }
}
