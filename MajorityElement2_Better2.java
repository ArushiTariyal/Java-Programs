import java.util.*;
public class MajorityElement2_Better2 {
    //BETTER2
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
                if(hm.get(nums[i])>nums.length/3 && !l.contains(nums[i])) l.add(nums[i]);
            }
            return l;
        }
    }
}
