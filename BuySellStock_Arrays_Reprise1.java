public class BuySellStock_Arrays_Reprise1 {
    class Solution {
        public int maxProfit(int[] prices) {
            int sell = 0;
            int buy = 0;
            int profit = 0;

            for(sell = 0; sell<prices.length; sell++){

                profit = Math.max(profit,prices[sell] - prices[buy]);

                if(prices[sell]<prices[buy]) buy = sell;
            }

            return profit;
        }
    }
}
