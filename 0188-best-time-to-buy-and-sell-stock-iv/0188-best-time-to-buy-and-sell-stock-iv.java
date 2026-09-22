class Solution {
    static int n,prices[],dp[][][];
    public int maxProfit(int k, int[] prices) {
        this.prices=prices;
        this.n=prices.length;
        dp=new int[n][2][k+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i][0],-1);
            Arrays.fill(dp[i][1],-1);
        }
        return helper(0,1,k);
    }
    public int helper(int idx,int buy,int k){
        if(idx==n || k<=0) return 0;
        if(dp[idx][buy][k]!=-1) return dp[idx][buy][k];
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[idx]+helper(idx+1,0,k),helper(idx+1,1,k));
        }else
            profit=Math.max(prices[idx]+helper(idx+1,1,k-1),helper(idx+1,0,k));
        return dp[idx][buy][k]=profit;
    }
}