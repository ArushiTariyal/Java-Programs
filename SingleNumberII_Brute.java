public class SingleNumberII_Brute {
    public static void main(String[] args){
        int[] nums = {5,5,5,6,4,4,4};
        int ans = 0;
        for(int bits = 0; bits<=31; bits++){
            int k = 1<<bits;
            int count = 0;
            for(int i = 0; i<nums.length; i++) {
                if((nums[i] & k)!=0) {
                    count++;
                }
            }
            if(count%3==1){
                ans = (ans | k);
            }
        }
        System.out.println(ans);
    }
}
