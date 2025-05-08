import java.util.ArrayList;
import java.util.List;

public class RecursivePermutationOfArray_Optimal {
    class Solution {
        public static void findPermu(int[] nums, List<List<Integer>> ans, int ind){
            if(ind==nums.length){
                List<Integer> permu = new ArrayList<>();
                for(int j = 0; j<nums.length; j++){
                    permu.add(nums[j]);
                }
                ans.add(new ArrayList<>(permu));
                return;
            }

            for(int i = ind; i<nums.length; i++){
                swap(nums,ind,i);
                findPermu(nums,ans,ind+1);
                swap(nums,ind,i);
            }
        }
        public static void swap(int[] nums, int s, int e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
        }
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            findPermu(nums,ans, 0);
            return ans;
        }
    }
}
