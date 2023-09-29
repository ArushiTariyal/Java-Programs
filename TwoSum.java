class Solution6 {
    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int j = 0; j<nums.length-1; j++){
            int a = nums[j];
            for(int i = j+1; i<nums.length; i++){
                if(a+nums[i] == target){
                    index[0] = j;
                    index[1] = i;
                    return index;
                }
            }
        }
        return null;
    }
}
public class TwoSum{
    public static void main(String[] args){
        int[] nums = {3,5,6,8,2};
        int[] index = Solution6.twoSum(nums,9);
        for(int e : index) System.out.print(e+" ");
    }
}
