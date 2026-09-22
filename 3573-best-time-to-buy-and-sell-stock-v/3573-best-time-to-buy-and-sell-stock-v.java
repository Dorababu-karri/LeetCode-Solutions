class Solution {
    int n,prices[];
    long dp[][][];
    //private static final long INF = 1_000_000_000_000_000L; // 10^15
    public long maximumProfit(int[] prices, int k) {
        this.prices=prices;
        this.n=prices.length;
        dp=new long[n][3][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++)
                Arrays.fill(dp[i][j],Long.MIN_VALUE);
        }
        return fun(0,0,k);
    }
    public long fun(int idx,int state,int k){
        if(idx==n || k<=0){
            return state==0?0:Long.MIN_VALUE/2;
            //return state==2?Long.MIN_VALUE/2:0;
        }
        if(dp[idx][state][k]!=Long.MIN_VALUE) return dp[idx][state][k];
        long profit=0;
        if(state==0){
            long doNothing=fun(idx+1,0,k);
            long buyFirst=-prices[idx]+fun(idx+1,1,k);
            long sellFirst=prices[idx]+fun(idx+1,2,k);
            profit=Math.max(doNothing,Math.max(buyFirst,sellFirst));
        }else if(state==1){
            long doNothing=fun(idx+1,1,k);
            long sell=prices[idx]+fun(idx+1,0,k-1);
            profit=Math.max(doNothing,sell);
        }else if(state==2){
            long doNothing=fun(idx+1,2,k);
            long buy=-prices[idx]+fun(idx+1,0,k-1);
            profit=Math.max(doNothing,buy);
        }
        return dp[idx][state][k]=profit;
    }
}