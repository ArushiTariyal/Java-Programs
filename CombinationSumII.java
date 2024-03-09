import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII{
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> op = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combiSum(candidates,0, target, ans, op);
        return ans;
    }
    public static void combiSum(int[] candidates,int i, int target, List<List<Integer>> ans, List<Integer> op){
        if(i==candidates.length){
            if(target==0 && !ans.contains(op)) {
                ans.add(new ArrayList<>(op));
            }
            return;
        }
        if(target>=candidates[i]){
            op.add(candidates[i]);
            combiSum(candidates,i+1,target-candidates[i],ans,op);
            op.remove(op.size()-1);
        }
        combiSum(candidates,i+1,target,ans,op);
    }
    public static void main(String[] args){
        System.out.println(combinationSum2(new int[]{10,1,2,6,1,5,7},7));
    }

}
