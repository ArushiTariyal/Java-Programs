public class LongestSubArrayWithSumKBruteN2 {
    //o(n2)
    public static void longestSubArray(int[] a, int k){
        int len = 0;
        for(int i = 0; i<=a.length-1; i++){
            int sum = 0;
            for(int j = i; j<=a.length-1; j++){
                sum += a[j];
                if(sum==k) len = Math.max(len,j-i+1);
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args){
        longestSubArray(new int[] {10,-20,2,-10},-10);
    }
}
