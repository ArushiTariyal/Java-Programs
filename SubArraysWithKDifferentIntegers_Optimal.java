import java.util.*;
public class SubArraysWithKDifferentIntegers_Optimal {
    class Solution {
        public int findCount(int[] nums, int k){
            int r = 0, l = 0, count = 0;
            HashMap<Integer,Integer> hm = new HashMap<>();

            while(r<nums.length){
                hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
                while(hm.size()>k){
                    hm.put(nums[l],hm.get(nums[l])-1);
                    if(hm.get(nums[l])==0) hm.remove(nums[l]);
                    l++;
                }
                count += r-l+1;
                r++;

            }
            return count;
        }
        public int subarraysWithKDistinct(int[] nums, int k) {
            int first = findCount(nums,k);
            int second = findCount(nums,k-1);
            return first-second;
        }
    }
}
