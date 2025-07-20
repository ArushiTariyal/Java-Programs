import java.util.Arrays;

public class MinimumNumberOfCoins_Greedy{
    class Solution {
        public int MinimumCoins(int[] coins, int amount) {
            int count = 0;
            int i = coins.length-1;
            Arrays.sort(coins);
            while(i>=0){
                if(amount>=coins[i]){
                    amount -= coins[i];
                    count++;
                }
                else i--;
            }
            if(amount!=0) return -1;
            return count;
        }
    }


}
