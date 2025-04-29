import java.util.ArrayList;
import java.util.List;
public class PainterRecursionPrintCount {
    public static int painterCount(int[] nums, List<Integer> subseq, int ind, int sum, int target){
        if(ind==nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        subseq.add(nums[ind]);
        sum += nums[ind];
        int left = painterCount(nums,subseq,ind+1,sum,target);

        subseq.remove(subseq.size()-1);
        sum-= nums[ind];
        int right = painterCount(nums,subseq,ind+1, sum, target);

        return left+right;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1};
        List<Integer> subseq = new ArrayList<>();
        System.out.println(painterCount(nums,subseq,0,0,4));
    }
}
