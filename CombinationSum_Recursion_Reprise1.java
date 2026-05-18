import java.util.ArrayList;
import java.util.List;

public class CombinationSum_Recursion_Reprise1 {
    class Solution {
        public void recurCombi(int[] cand, int t, int sum, List<List<Integer>> al, List<Integer> combie, int i){
            if(sum==t){
                al.add(new ArrayList<>(combie));
                return;
            }
            if(i==cand.length || sum>t){
                return;
            }

            combie.add(cand[i]);
            recurCombi(cand, t, sum+cand[i], al, combie, i);
            combie.remove(combie.size()-1);
            recurCombi(cand, t, sum, al, combie, i+1);
        }
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> al = new ArrayList<>();
            List<Integer> combie = new ArrayList<>();
            recurCombi(candidates, target, 0, al, combie, 0);
            return al;
        }
    }
}
