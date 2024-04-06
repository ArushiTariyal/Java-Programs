public class SearchInsertPositionRecursive2 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            return binarySearch(nums,target,0,nums.length-1,nums.length);
        }
        public static int binarySearch(int[] nums, int target, int low, int high, int ans){
            if(low>high) return ans;
            int mid = low + (high-low)/2;
            if(nums[mid]>=target) return binarySearch(nums,target,low,high-1,mid);
            return binarySearch(nums,target,low+1,high,ans);
        }
    }
}
