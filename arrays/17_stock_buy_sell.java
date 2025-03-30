class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        long maxi = 0;
        long mini = Long.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            mini = Math.min(mini,prices[i]);
            maxi = Math.max(maxi,prices[i] - mini);
        }

        return (int)(maxi); 
    }
}