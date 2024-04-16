public class FindMinimumInRotatedSortedArray {
    class Solution {
        public int findMin(int[] nums) {
            int low = 0, high = nums.length-1;
            int ans = Integer.MAX_VALUE;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid]>=nums[low]){
                    if(nums[low]<ans) ans = nums[low];
                    low = mid+1;
                }
                else{
                    if(nums[mid]<ans) ans = nums[mid];
                    high = mid-1;
                }
            }
            return ans;
        }
    }
}
