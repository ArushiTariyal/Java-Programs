import java.util.ArrayList;
public class LongestConsecutiveSequenceBetter1 {
        public int longestConsecutive(int[] nums) {
            //better
            if(nums.length==0) return 0;
            sort(nums,0,nums.length-1);
            int longest = 1;
            int max = nums[0];
            int count = 1;
            for(int i = 1; i<nums.length; i++){
                if(nums[i]==max+1){
                    count++;
                    max = nums[i];
                }
                else if(nums[i] > max+1){

                    count = 1;
                    max = nums[i];
                }
                longest = Math.max(longest,count);

            }
            return longest;
        }
        public void sort(int[] nums, int low, int high){
            if(low>=high) return;
            int mid = low +(high-low)/2;
            sort(nums,low,mid);
            sort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
        public void merge(int[] nums, int low, int mid, int high){
            int l = low, r=mid+1;
            ArrayList<Integer> temp = new ArrayList<>();
            while(l<=mid && r<=high){
                if(nums[l]<=nums[r]) temp.add(nums[l++]);
                else temp.add(nums[r++]);
            }
            while(l<=mid){
                temp.add(nums[l++]);
            }
            while(r<=high){
                temp.add(nums[r++]);
            }
            int i = 0;
            for(int e: temp){
                nums[low+i] = e;
                i++;
            }
        }

}
