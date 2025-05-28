import java.util.ArrayList;
import java.util.List;
public class CombinationSumIII_Recursion_Optimal {
    class Solution {
        public void findCombos(int ind, int sum, int n, List<Integer> seq, List<List<Integer>> ans, int k){
            if(sum==n && k==0){
                ans.add(new ArrayList<Integer>(seq));
                return;
            }
            if(ind==9) return;

            for(int i = ind+1; i<=9; i++){

                if(sum+i<=n && k>0){
                    seq.add(i);
                    findCombos(i,sum+i,n,seq,ans,k-1);
                    seq.remove(seq.size()-1);
                }
                else return;
            }
        }
        public List<List<Integer>> combinationSum3(int k, int n) {
            int sum = 0;
            for(int i = 1; i<=k; i++){
                sum += i;
            }
            if(sum>n) return new ArrayList<>();

            sum = 0;
            for(int i = 9; i>9-k; i--){
                sum += i;
            }
            if(sum<n) return new ArrayList<>();

            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> seq = new ArrayList<>();
            findCombos(0,0,n,seq,ans,k);
            return ans;
        }
    }
}
