public class ConvertMinHeapToMaxHeap {
    class Solution {
        public void heapifyUp(int[] maxheap, int i){
            int parent = (i-1)/2;
            if(i>0 && maxheap[parent]<maxheap[i]){
                int el = maxheap[i];
                maxheap[i] = maxheap[parent];
                maxheap[parent] = el;
                heapifyUp(maxheap, parent);
            }
            return;

        }
        public int[] maxiHeap(int[] nums){
            int i = 0;
            int n = nums.length;
            int[] maxheap = new int[n];

            while(i<n){
                maxheap[i] = nums[i];
                heapifyUp(maxheap, i);
                i++;
            }
            return maxheap;
        }
        public int[] minToMaxHeap(int[] nums) {
            return maxiHeap(nums);
        }
    }
}
