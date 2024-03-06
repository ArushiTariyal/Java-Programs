public class MissingNumberOptimal2 {
    public static int missingNumber(int[] nums) {
        int actualXOR= 0;
        int numsXOR = 0;
        int i;
        for(i = 0; i<=nums.length-1;i++){
            actualXOR ^= (i+1);
            numsXOR ^= nums[i];
        }
        return actualXOR^numsXOR;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1,2,0,4,5}));
    }

}
