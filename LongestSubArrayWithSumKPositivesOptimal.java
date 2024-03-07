public class LongestSubArrayWithSumKPositivesOptimal {
    public static void longestSubArray(int[] a, long k){
        int left=0, right = 0;
        long sum = 0;
        int len = 0;
        int n = a.length;
        while(right<=n-1){
            sum += a[right];
            while(sum>k && left<=right){
                sum -= a[left];
                left++;
            }
            if(sum==k) len = Math.max(len,right-left+1);
            right++;
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
        longestSubArray(new int[]{1,0,1,1,2},2);
    }
}
