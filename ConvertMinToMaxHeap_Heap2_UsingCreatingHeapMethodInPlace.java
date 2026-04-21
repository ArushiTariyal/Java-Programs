public class ConvertMinToMaxHeap_Heap2_UsingCreatingHeapMethodInPlace {
    class Solution {
        public void heapifyDown(int i, int[] nums, int n){
            int max = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left<n && nums[left]>nums[max]) max = left;
            if(right<n && nums[right]>nums[max]) max = right;
            if(max!=i){
                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
                i = max;
                heapifyDown(i,nums,n);
            }
            else return;
        }
        public int[] minToMaxHeap(int[] nums) {
            int i = nums.length/2 - 1;
            while(i>=0){
                heapifyDown(i,nums,nums.length);
                i--;
            }
            return nums;

        }
    }
}
