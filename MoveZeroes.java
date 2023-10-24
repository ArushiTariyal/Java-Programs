public class MoveZeroes {
    static class Solution {
        public static void moveZeroes(int[] nums) {
            int i = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j]!=0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;

                }
            }
            for(int e: nums) System.out.print(e+" ");
        }
    }
    public static void main(String[] args){
        Solution.moveZeroes(new int[]{1,0,9,7,0,0,0,4,5,0,3});
    }
}
