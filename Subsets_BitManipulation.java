import java.util.List;
import java.util.ArrayList;
public class Subsets_BitManipulation {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {

            List<List<Integer>> ans = new ArrayList<>();

            int n = nums.length;
            int subseq = 1<<n;
            for(int i = 0; i<subseq; i++){
                List<Integer> seq = new ArrayList<>();
                for(int j = 0; j<n; j++){
                    if((i&(1<<j))!= 0){
                        seq.add(nums[j]);
                    }
                }
                ans.add(new ArrayList<>(seq));
            }
            return ans;
        }
    }
}
