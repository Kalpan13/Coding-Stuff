/*   Best Time to Buy and Sell Stock II
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3287/ */

class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        for (int i=0;i<prices.length-1;i++)
        {
            prices[i] = prices[i+1]-prices[i];     
        }
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]>0)
                profit += prices[i];
        }
        return profit;
    }
}