public class MinToMaxHeapConversion {
    class Solution {
        public void heapify_down(int[] nums, int ind){
            while(ind<nums.length){
                int parent = ind;
                int lchild = 2*ind + 1;
                int rchild = 2*ind + 2;

                if(lchild<nums.length && nums[parent]<nums[lchild]) parent = lchild;
                if(rchild<nums.length && nums[parent]<nums[rchild]) parent = rchild;

                if(parent != ind ){
                    int temp = nums[parent];
                    nums[parent] = nums[ind];
                    nums[ind] = temp;
                    ind = parent;
                }
                else break;
            }
        }
        public int[] minToMaxHeap(int[] nums) {
            int n = nums.length;
            for(int i = (n/2)-1; i>=0; i--){
                heapify_down(nums,i);
            }
            return nums;
        }

    }
}
