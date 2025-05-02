import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2Recursion {
    class Solution {
        public static void findSubsets(int[] nums,List<List<Integer>> ans, List<Integer> seq, int ind){
            if(ind==nums.length){
                ans.add(new ArrayList<>(seq));
                return;
            }
            seq.add(nums[ind]);
            findSubsets(nums,ans,seq,ind+1);
            int val = seq.remove(seq.size()-1);
            ind = getValidIndexBS(nums,0,nums.length-1,val);
            findSubsets(nums,ans,seq,ind);
        }

        public static int getValidIndexBS(int[] nums, int low, int high, int val){
            while(low<=high){
                int mid = low + (high-low)/2;

                if(nums[mid]>val) high--;
                else low++;
            }
            return low;
        }
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> seq = new ArrayList<>();
            Arrays.sort(nums);
            findSubsets(nums,ans,seq,0);
            return ans;
        }
    }
}
