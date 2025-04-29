import java.util.*;
public class PainterRecursion {
    public static void painter(int[] nums, List<Integer> subseq, List<List<Integer>> ans, int i, int sum, int target){
        if(i == nums.length){
            if(sum==target){
                ans.add(new ArrayList<>(subseq));
                return;

            }
        }
        subseq.add(nums[i]);
        sum += nums[i];
        painter(nums,subseq,ans,i+1,sum,target);
        subseq.remove(subseq.size()-1);
        sum-= nums[i];
        painter(nums,subseq,ans,i+1,sum,target);

    }
    public static void main(String[] args){
        int[] nums = {9,2,1};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subseq = new ArrayList<>();
        painter(nums,subseq, ans, 0, 0,3);
        for(List<Integer> ee: ans ){
            for(Integer e: ee){
                System.out.print(e+ " ");
            }
            System.out.println();
        }
    }
}
