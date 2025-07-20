import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceKElementsByRankInArray {
    public int[] replacingByRank(int[] nums){
        Map<Integer,Integer> hm = new HashMap<>();
        int rank = 1;

        int[] clone = nums.clone();
        Arrays.sort(clone);

        for(int e: clone){
            if(!hm.containsKey(e)) hm.put(e,rank++);
        }

        int[] ans = new int[nums.length];

        for(int i = 0; i<ans.length; i++){
            ans[i] = hm.get(nums[i]);
        }
        return ans;
    }
}
