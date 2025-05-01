import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSums2RecursionDuplicates {
    class Solution {
        public static void findSubsets(int[] nums, List<List<Integer>> ans, List<Integer> sset, int ind){

            ans.add(new ArrayList<>(sset));
            for(int i = ind; i<nums.length; i++){
                if(i>ind && nums[i]==nums[i-1]) continue;
                sset.add(nums[i]);
                findSubsets(nums,ans,sset,i+1);
                sset.remove(sset.size()-1);
            }
        }
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> sset = new ArrayList<>();
            Arrays.sort(nums);
            findSubsets( nums, ans, sset ,0);
            return ans;
        }
    }
}
