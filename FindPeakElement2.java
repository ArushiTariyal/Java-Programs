public class FindPeakElement2 {
    class Solution {
        public int findPeakElement(int[] nums) {
            int n = nums.length;
            int low  = 1, high = nums.length-2;
            int ans =  Integer.MIN_VALUE;
            int ind = n-1;
            if(nums.length==1) return 0;
            if(nums[0]>nums[1]) return 0;
            if(nums[n-1]>nums[n-2]) return n-1;

            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
                if(nums[mid]>nums[mid+1]){
                    ans = nums[mid];
                    ind = mid;
                    high = mid-1;
                }
                else low = mid+1;
            }

            return ind;
        }
    }
}
