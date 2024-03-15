public class LongestSubArrayWithSumKBruteN3 {
    //o(n3)
    public static void longestSubArray(int[] a, int t){
        int len = 0;
        for(int i = 0; i<=a.length-1; i++){
            for(int j = i; j<=a.length-1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                    if (sum == t) len = Math.max(len, k- i + 1);
                }
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args){
        longestSubArray(new int[] {10,-20,2,-10},-10);
    }
}
