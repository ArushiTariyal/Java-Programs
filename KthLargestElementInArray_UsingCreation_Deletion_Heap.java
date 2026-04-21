import java.util.ArrayList;
import java.util.List;

public class KthLargestElementInArray_UsingCreation_Deletion_Heap {
    class Solution {
        public void heapifyDown(int i, int[] nums, int size){
            int max = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left<size && nums[left]>nums[max]){
                max = left;
            }
            if(right<size && nums[right]>nums[max]){
                max = right;
            }
            if(max!=i){
                int temp = nums[i];
                nums[i] = nums[max];
                nums[max] = temp;
                i = max;
                heapifyDown(i, nums, size);
            }
            else return;

        }
        public int deleteFromHeap(int[] nums, int size, int k){
            List<Integer> ans = new ArrayList<>();

            int i = 0;
            while(i<k){
                int temp = nums[0];
                ans.add(temp);
                nums[0] = nums[size-1];
                nums[size-1] = temp;

                size--;

                heapifyDown(0,nums,size);
                i++;
            }
            return ans.get(k-1);

        }
        public int findKthLargest(int[] nums, int k) {
            //create maxheap
            //delete from maxheap and add to array.
            //this will cause the created maxheap to get sorted to descending

            //1. create maxheap
            int end = (nums.length/2) -1;
            for(int i = end; i>=0; i--){
                heapifyDown(i,nums,nums.length);
            }

            //2. delete from maxheap and add to array
            return deleteFromHeap(nums,nums.length,k);
        }
    }
}
