import java.util.Arrays;
public class SingleNumberII_Optimal {
    public static void main(String[] args){
        int[] nums = {1,3,4,2,4,3,2,3,4,2};
        Arrays.sort(nums);
        int flag = 0;
        for(int i= 1; i<nums.length; i = i+3){
            if(nums[i]!= nums[i-1] || nums[i]!=nums[i+1]){
                flag = 1;
                System.out.println(nums[i-1]);
                break;
            }
        }
        if(flag==0) System.out.println(nums[nums.length-1]);
    }
}
