public class LongestSubArrayWithSumKForAllIntegersBrute {
    public static void longestSubArray(int[] ip, int k){
        int max=0;
        for(int i = 0; i<=ip.length-1; i++){

            for(int j = i; j<=ip.length-1; j++){
                int sum = 0;
                for(int m= i; m<=j; m++){
                    sum+=ip[m];
                    if(sum==k){
                        max = Math.max(max,m-i+1);
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] ip = {1, 2, 3, 1, 1, 1, 1};
        longestSubArray(ip,3);
    }
}
