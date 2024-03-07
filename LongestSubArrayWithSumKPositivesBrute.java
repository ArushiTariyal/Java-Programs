
public class LongestSubArrayWithSumKPositivesBrute {
    public static void longestSubArray(int[] ip, int k){
        int max = 0;
        for(int i = 0; i<=ip.length-1 ;i++){
            int s = 0;
            for(int j = i; j<=ip.length-1; j++){
                s += ip[j];
                if(s==k){
                    max = Math.max(max,j-i+1);
                  break;
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
