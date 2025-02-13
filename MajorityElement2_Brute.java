import java.util.ArrayList;
import java.util.List;
public class MajorityElement2_Brute {
    //BRUTE
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> l = new ArrayList<>();
            for(int i= 0; i<nums.length; i++){
                if(l.size()==0 || !l.contains(nums[i])){
                    int cnt = 0;
                    for(int j = 0; j<nums.length; j++){
                        if(nums[j]==nums[i]) cnt++;
                    }
                    if(cnt> nums.length/3) l.add(nums[i]);
                }
                if(l.size()==2) break;
            }
            return l;
        }
    }
}
