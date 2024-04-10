public class SearchFirstAndLastPositionOptimal2 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {

            int first = first(nums,target);

            // if(nums.length!=0 && high !=-1 && nums[high]==target) end = high;
            if( first == -1 || nums[first] != target) return new int[] {-1,-1};
            return new int[]{first,last(nums,target)};

        }
        public static int first(int[] nums, int target){
            int low = 0, high = nums.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] >= target) {
                    ans = mid;
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            return ans;
        }
        public static int last(int[] nums, int target){
            int low = 0, high = nums.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] <= target) {
                    ans = mid;
                    low = mid + 1;
                }
                else high = mid - 1;
            }
            return ans;
        }
    }
}
