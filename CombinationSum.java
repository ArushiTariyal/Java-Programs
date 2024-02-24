import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> op = new ArrayList<>();
            solve(candidates,op,0,target,ans);
            return ans;
        }
        public static void solve(int[] cand, List<Integer> op, int i,int t, List<List<Integer>> ans){
            if(i>=cand.length ){
                if(t==0){
                    ans.add(new ArrayList<>(op));
                }
                return;
            }

            if(cand[i]<=t){
                op.add(cand[i]);
                solve(cand,op,i,t-cand[i],ans);
                op.remove(op.size()-1);
            }

            solve(cand,op,i+1,t,ans);
        }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7},7));
    }
}
