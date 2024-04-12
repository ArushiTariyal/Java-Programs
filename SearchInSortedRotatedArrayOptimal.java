public class SearchInSortedRotatedArrayOptimal {
    class Solution {
        public int search(int[] nums, int target) {
            int low = 0, high = nums.length-1;
            int ans = nums.length;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid]<nums[0]){
                    ans = mid;
                    high = mid-1;
                }
                else low = mid + 1;
            }
            if(target>=nums[0]) return binarySearch(nums,0,ans-1, target);
            return binarySearch(nums,ans,nums.length-1, target);
        }
        public static int binarySearch(int[] nums, int low, int high, int target){
            int ans = nums.length;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] >=target){
                    ans = mid;
                    high = mid-1;
                }
                else low = mid+1;
            }
            if(ans != nums.length && nums[ans]==target ) return ans;
            return -1;
        }

    }
}
