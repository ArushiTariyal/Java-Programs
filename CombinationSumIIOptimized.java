import java.util.*;

public class CombinationSumIIOptimized {
        public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<Integer> op = new ArrayList<>();
            Set<List<Integer>> ans = new HashSet<>();
            combiSum(candidates,0, target, ans, op);
            return new ArrayList<>(ans);
        }
        public static void combiSum(int[] candidates,int i, int target, Set<List<Integer>> ans, List<Integer> op){
            if(target==0) {
                ans.add(new ArrayList<>(op));
                return;
            }
            if(i==candidates.length){
                return;
            }
            if(target>=candidates[i]){
                op.add(candidates[i]);
                combiSum(candidates,i+1,target-candidates[i],ans,op);
                int e = op.remove(op.size()-1);
                while(i<=candidates.length-1 && candidates[i]==e) {
                    i += 1;
                }
                combiSum(candidates, i, target, ans, op);
            }
        }
        public static void main(String[] args){
            System.out.println(combinationSum2(new int[]{10,1,2,6,1,5,7},7));
        }



}
