public class CheckIfArrayRepresentsAMinHeap {
    class Solution {
        public boolean isHeap(int[] nums) {
            int i = nums.length/2 - 1;
            int n = nums.length;

            while(i>=0){
                int left = i*2+1;
                int right = i*2+2;

                if(left<n && nums[left]<nums[i]) return false;
                if(right<n && nums[right]<nums[i]) return false;
                i--;
            }
            return true;
        }
    }
}
