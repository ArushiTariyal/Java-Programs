import java.util.ArrayList;
import java.util.List;

public class RecursiveSubsets {
    class Solution {
        public static void findSubsets(List<List<Integer>> ans, List<Integer> al, int[] nums, int i){
            if(i>=nums.length){
                ans.add(new ArrayList<>(al));
                return;
            }
            al.add((Integer) nums[i]);
            findSubsets(ans,al,nums,i+1);
            al.remove(al.size() - 1);
            findSubsets(ans,al,nums,i+1);
        }
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> al = new ArrayList<>();
            findSubsets(ans, al,nums,0);
            return ans;
        }
    }
}
