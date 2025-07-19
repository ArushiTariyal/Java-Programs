public class CheckIfArrayInMinHeap {
    class Solution {
        public boolean isHeap(int[] nums) {
            //internal nodes are 0 to n/2-1
            int n = nums.length;
            for(int i = nums.length/2-1; i>=0; i--){
                int lchild = 2*i+1;
                int rchild = 2*i+2;

                if(lchild<n && nums[lchild]<nums[i]) return false;
                if(rchild<n && nums[rchild]<nums[i]) return false;
            }
            return true;
        }
    }
}
