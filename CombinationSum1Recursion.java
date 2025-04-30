import java.util.ArrayList;
import java.util.List;

public class CombinationSum1Recursion {
    //TC - O(2^target * k) k is the avg size of every new arraylist
    // sc = target * k  as the new arraylist created are directly stored in main ans only. and the size of main is because of these arraylists only
    
    class Solution {
        public static void combinationSum1(List<List<Integer>> finalAns, List<Integer> seq, int ind, int sum, int target, int[] candidates){
            if(ind==candidates.length){
                if(sum==target){
                    finalAns.add(new ArrayList<>(seq));
                    return;
                }
                return;
            }

            if(sum+candidates[ind] <= target){
                seq.add(candidates[ind]);
                combinationSum1(finalAns,seq , ind,sum+candidates[ind],target, candidates);
                seq.remove(seq.size()-1);
            }



            combinationSum1(finalAns, seq, ind+1, sum, target, candidates);
        }
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> finalAns = new ArrayList<>();
            List<Integer> seq = new ArrayList<>();
            combinationSum1(finalAns, seq, 0,0,target,candidates);
            return finalAns;
        }
    }
}
