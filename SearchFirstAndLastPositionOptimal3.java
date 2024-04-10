public class SearchFirstAndLastPositionOptimal3 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {

            int first = first(nums,target);
            if( nums.length==0 ||first==nums.length|| nums[first] != target) return new int[] {-1,-1};
            return new int[]{first,last(nums,target)};

        }
        public static int first(int[] nums, int target){
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] >= target) {

                    high = mid - 1;
                }
                else low = mid + 1;
            }
            return low;
        }
        public static int last(int[] nums, int target){
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] <= target) {
                    low = mid + 1;
                }
                else high = mid - 1;
            }
            return high;
        }
    }

}
