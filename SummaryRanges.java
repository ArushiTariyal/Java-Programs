import java.util.ArrayList;
import java.util.List;
class Solution9 {
    public static List<String> summaryRanges(int[] nums) {
        List <String> l = new ArrayList<String>();
        for(int start = 0; start<nums.length;){
            int end = start;
            while(end+1<nums.length && nums[end+1]==nums[end]+1){
                end++;
            }

            if(start<end) l.add(nums[start]+"->"+nums[end]);
            else l.add(Integer.toString(nums[start]));

            start = end+1;
        }
        return l;
    }
}
public class SummaryRanges {
    public static void main(String[] args){
        System.out.println(Solution9.summaryRanges(new int[] {0,1,2,4,5,7}));
        System.out.println(Solution9.summaryRanges(new int[] {0,2,3,4,6,8,9}));
    }
}
