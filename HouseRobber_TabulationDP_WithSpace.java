import java.util.Arrays;

public class HouseRobber_TabulationDP_WithSpace {
    class Solution {
        public int houseRobDP(int[] money, int[] dp){
            dp[0] = money[0];
            for(int ind = 1; ind<money.length; ind++){
                int take = money[ind];
                if(ind-2>=0) {
                    take = money[ind] + dp[ind-2];
                }

                int notTake = 0 + dp[ind-1];

                dp[ind] = Math.max(take, notTake);
            }
            return dp[money.length-1];
        }
        public int houseRobber(int[] money) {

            if(money.length==1) return money[0];
            int[] dp = new int[money.length-1];
            Arrays.fill(dp,0);

            int[] arr1 = new int[money.length-1];
            int[] arr2 = new int[money.length-1];

            int j = 0, k = 0;

            for(int i = 0; i<money.length; i++){
                if(i!=money.length-1) arr1[j++] = money[i];
                if(i!=0) arr2[k++] = money[i];
            }

            int val1 = houseRobDP(arr1, dp);
            Arrays.fill(dp,0);
            int val2 = houseRobDP(arr2, dp);
            return Math.max(val1, val2);
        }
    }
}
