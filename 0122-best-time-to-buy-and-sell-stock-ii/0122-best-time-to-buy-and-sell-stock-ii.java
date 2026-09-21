class Solution {
    static int n,prices[],dp[][];
    public int helper(int idx,int buy){
        if(idx==n) return 0;
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[idx]+helper(idx+1,0),helper(idx+1,1));
        }else{
            profit=Math.max(prices[idx]+helper(idx+1,1),helper(idx+1,0));
        }
        return dp[idx][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        this.prices=prices;
        this.n=prices.length;
        dp=new int[n][2];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
         return helper(0,1);
    }

}