class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], max_profit = 0;
        int n=prices.length;
    for (int i = 1; i <n; i++) {
 
      // Checking for lower buy value
      if (buy > prices[i])
        buy = prices[i];
 
      // Checking for higher profit
      else if (prices[i] - buy > max_profit)
        max_profit = prices[i] - buy;
    }
    return max_profit;
  }
}
