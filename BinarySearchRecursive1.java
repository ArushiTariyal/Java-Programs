public class BinarySearchRecursive1 {
    class Solution {
        public int search(int[] nums, int target) {
            return binarySearch(nums,target,0,nums.length-1);
        }
        public static int binarySearch(int[] nums, int target, int low, int high){
            if(low>high) return -1;
            int mid = low + (high-low)/2;
            if(target == nums[mid]) return mid;
            else if (target > nums[mid]) return binarySearch(nums,target,mid+1,high);
            return binarySearch(nums,target,low,mid-1);
        }
    }
}
