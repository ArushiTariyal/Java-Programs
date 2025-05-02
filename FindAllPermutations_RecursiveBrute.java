import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllPermutations_RecursiveBrute {
    class Solution {


        public static void findPermutations(int[] nums,List<List<Integer>> ans, List<Integer> seq, Map<Integer,Boolean> map){
            if(seq.size()==nums.length){
                ans.add(new ArrayList<>(seq));
                return;
            }


            for(int i = 0; i<nums.length; i++){
                if(map.getOrDefault(i,false)) continue;

                seq.add(nums[i]);
                map.put(i,true);

                findPermutations(nums,ans,seq,map);

                seq.remove(seq.size()-1);
                map.put(i,false);

            }
        }
        public List<List<Integer>> permute(int[] nums) {
            List<Integer> seq = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            Map<Integer,Boolean> map  = new HashMap<>();
            findPermutations(nums,ans,seq,map);
            return ans;
        }
    }   
}
