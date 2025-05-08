import java.util.ArrayList;
import java.util.List;

public class RecursivePermutationsOfArray_Brute {
    class Solution {
        //Brute Approach
        public static void findPermutations(int[] nums, boolean[] ds, List<Integer> permu, List<List<Integer>> ans){
            if(permu.size()==nums.length){
                ans.add(new ArrayList<>(permu));
                return;
            }
            for(int i = 0; i<nums.length; i++){
                if(ds[i]) continue;
                ds[i] = true;
                permu.add(nums[i]);
                findPermutations(nums,ds,permu,ans);
                permu.remove(permu.size()-1);
                ds[i] = false;
            }
        }
        public List<List<Integer>> permute(int[] nums) {
            boolean[] ds = new boolean[nums.length];
            List<Integer> permu = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            findPermutations(nums,ds,permu,ans);
            return ans;
        }
    }
}
