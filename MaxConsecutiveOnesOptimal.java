public class MaxConsecutiveOnesOptimal {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int i = 0;
            int count = 0;
            while(i<=nums.length-1){
                if(nums[i]==0){
                    if(max<count) max = count;
                    count = 0;
                }
                else count++;
                i=i+1;
            }
            if(max<count) max = count;
            return max;
        }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,1,0,0,1,1,0,1,1,1,1}));
    }

}
