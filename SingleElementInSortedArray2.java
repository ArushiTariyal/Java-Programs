public class SingleElementInSortedArray2 {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int n = nums.length;
            if(n==1 || nums[0] != nums[1]) return nums[0];
            if(nums[n-1]!=nums[n-2]) return nums[n-1];
            int low = 1, high = n-2;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
                else if(mid%2==0){
                    if(nums[mid]==nums[mid+1]) low = mid+2;
                    else if(nums[mid]==nums[mid-1]) high = mid-2;
                }
                else{
                    if(nums[mid]==nums[mid-1]) low = mid+1;
                    else if(nums[mid]==nums[mid+1]) high = mid-1;
                }
            }
            return -1;
        }
    }
}
