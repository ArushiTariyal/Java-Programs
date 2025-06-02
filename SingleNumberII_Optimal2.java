public class SingleNumberII_Optimal2 {
    public static void main(String[] args){
        int[] nums = {8,2,2,2,3,4,3,4,3,4};
        int ones = 0;
        int twos = 0;

        for(int i = 0; i<nums.length; i++){
            ones = (nums[i]^ones) & ~twos;
            twos = (nums[i]^twos) & ~ones;
        }
        System.out.println(ones);
    }
}
