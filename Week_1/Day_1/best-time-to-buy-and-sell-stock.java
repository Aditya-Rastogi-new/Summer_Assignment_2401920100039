1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice = Integer.MAX_VALUE;
4        int maxProfit = 0;
5        for (int i = 0; i<prices.length;i++){
6            if (prices[i] < minPrice) {
7                minPrice = prices[i]; 
8            }
9            else{
10                int profit=prices[i]-minPrice;
11                maxProfit = Math.max(maxProfit, profit);
12            }
13        }
14        return maxProfit;
15    }
16}
