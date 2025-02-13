import java.util.ArrayList;
import java.util.List;

public class MajorityElement2_Optimal {
    //OPTIMAL
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            int el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0;
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                if(cnt1==0 && nums[i]!=el2){
                    el1 = nums[i];
                    cnt1 = 1;
                }
                else if(cnt2==0 && nums[i]!=el1){
                    el2 = nums[i];
                    cnt2 = 1;
                }
                else if(el1 == nums[i]){
                    cnt1++;
                }
                else if(el2 == nums[i]){
                    cnt2++;
                }
                else{
                    cnt1--;
                    cnt2--;
                }

            }
            int flag1 = 0, flag2 = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i]==el1) flag1++;
                else if(nums[i]==el2) flag2++;
            }
            if(flag1 > nums.length/3) l.add(el1);
            if(flag2 > nums.length/3) l.add(el2);
            return l;
        }
    }
}
