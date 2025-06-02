import java.util.List;
import java.util.ArrayList;
public class SingleNumberIII_Optimal {
    public static void main(String[] args){
        int[] nums = {2,4,2,14,8,7,7,8};
        int xor = 0;
        for(int i = 0; i<nums.length; i++){
            xor ^= nums[i];
        }
        xor = xor & -xor;
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if((nums[i] & xor) == 0) al1.add(nums[i]);
            else al2.add(nums[i]);
        }
        int xor1 = 0;
        int xor2 = 0;
        for(int e: al1){
            xor1 ^= e;
        }
        for(int e: al2){
            xor2 ^= e;
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(xor1);
        ans.add(xor2);
        for(int e: ans){
            System.out.print(e+" ");
        }
    }
}
