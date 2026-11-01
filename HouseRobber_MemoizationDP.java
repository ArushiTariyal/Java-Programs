import java.util.Arrays;

public class HouseRobber_MemoizationDP {
    class Solution {
        public int houseRobDP(int[] money, int ind, int[] dp){
            if(ind==0){
                return money[ind];
            }

            if(dp[ind]!= -1) return dp[ind];

            int take = money[ind];

            if(ind-2>=0) {

                take = money[ind] + houseRobDP(money, ind-2, dp);
            }

            int notTake = 0 + houseRobDP(money, ind-1, dp);

            return dp[ind] = Math.max(take, notTake);
        }
        public int houseRobber(int[] money) {

            if(money.length==1) return money[0];
            int[] dp = new int[money.length];
            Arrays.fill(dp,-1);

            int[] arr1 = new int[money.length-1];
            int[] arr2 = new int[money.length-1];

            int j = 0, k = 0;

            for(int i = 0; i<money.length; i++){
                if(i!=money.length-1) arr1[j++] = money[i];
                if(i!=0) arr2[k++] = money[i];
            }

            int val1 = houseRobDP(arr1, arr1.length-1, dp);
            Arrays.fill(dp,-1);
            int val2 = houseRobDP(arr2, arr2.length-1, dp);
            return Math.max(val1, val2);
        }
    }
}
