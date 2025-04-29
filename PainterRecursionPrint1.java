import java.util.ArrayList;
import java.util.List;

public class PainterRecursionPrint1 {
        public static boolean painter1(int[] nums, List<Integer> subseq, List<List<Integer>> ans, int i, int sum, int target){
            if(i == nums.length){
                if(sum==target){
                    ans.add(new ArrayList<>(subseq));
                    return true;
                }
                return false;
            }
            subseq.add(nums[i]);
            sum += nums[i];
            if(painter1(nums,subseq,ans,i+1,sum,target)==true) return true;
            subseq.remove(subseq.size()-1);
            sum-= nums[i];
            return painter1(nums,subseq,ans,i+1,sum,target);

        }
        public static void main(String[] args){
            int[] nums = {9,2,1};
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> subseq = new ArrayList<>();
            painter1(nums,subseq, ans, 0, 0,3);
            for(List<Integer> ee: ans ){
                for(Integer e: ee){
                    System.out.print(e+ " ");
                }
                System.out.println();
            }
        }


}
