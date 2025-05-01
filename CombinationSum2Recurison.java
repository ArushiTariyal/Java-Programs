import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2Recurison {
    class Solution {
        public static void findUniqueCombinations(int[] cand, List<List<Integer>> ans, int ind, int target, List<Integer> seq){
            if(target==0){
                ans.add(new ArrayList<>(seq));
                return;
            }

            for(int i = ind; i<cand.length; i++){
                if(i>ind && cand[i]==cand[i-1]) continue;
                if(cand[i]>target) return;

                seq.add(cand[i]);
                findUniqueCombinations(cand,ans,i+1,target-cand[i],seq);
                seq.remove(seq.size()-1);
            }
        }
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> seq = new ArrayList<>();
            Arrays.sort(candidates);
            findUniqueCombinations(candidates, ans, 0,target, seq);
            return ans;
        }
    }
}
