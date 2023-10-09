class Solution16 {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i<nums.length; i++){
            xor ^= nums[i];
        }
        return xor;
    }
}
public class SingleNumber {
    public static void main(String[] args){
        System.out.println(Solution16.singleNumber(new int[] {2,4,5,5,2,4,7}));
    }
}
