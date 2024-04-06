public class SearchInsertPositionRecursive {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0, high = nums.length-1;
            return binarySearch(nums,target,low,high);
        }
        public static int binarySearch(int[] nums, int target, int low, int high){
            if(low>high) return low;
            int mid = low + (high-low)/2;
            if(nums[mid]>target) return binarySearch(nums,target,low,mid-1);
            else if(nums[mid]<target) return binarySearch(nums,target,mid+1,high);
            else return mid;
        }
    }
}
