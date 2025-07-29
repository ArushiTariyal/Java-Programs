import java.util.Arrays;

public class MinimumCoins_Denomination_Re {
    class Solution {
        public int MinimumCoins(int[] coins, int amount) {
            int count = 0;
            Arrays.sort(coins);

            int i = coins.length;
            while(i>=0){
                if(amount>=coins[i]){
                    count++;
                    amount -= coins[i];
                }
                else i--;
            }
            if(amount!=0) return -1;
            return count;

        }
    }


}
