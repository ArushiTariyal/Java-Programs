import java.util.HashMap;
class Solution8 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++){
            if(!hm.containsKey(nums[i])||Math.abs(hm.get(nums[i])-i)>k) hm.put(nums[i],i);
            else return true;
        }
        return false;
    }
}
public class ContainsDuplicateII {
    public static void main(String[] args){
        System.out.println(Solution8.containsNearbyDuplicate(new int[] {1,0,1,1},1));
        System.out.println(Solution8.containsNearbyDuplicate(new int[] {1,2,3,1,2,3},2));
    }
}
