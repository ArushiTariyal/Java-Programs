public class FindPeakElement {
    class Solution {
        public int findPeakElement(int[] nums) {
            int low  = 1, high = nums.length-2;
            int ans =  Integer.MIN_VALUE;
            int ind = nums.length-1;
            if(nums.length==1) return 0;


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
            if(nums[0]>ans){
                ans = nums[0];
                ind = 0;
            }
            if(nums[nums.length-1]>ans){
                ind = nums.length-1;
            }
            return ind;
        }
    }
}
