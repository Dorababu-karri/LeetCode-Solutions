class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n+1];
        if(n==1) return costs[0]+1;
        dp[0]=0;
        dp[1]=costs[0]+1;
        dp[2]=Math.min(dp[0]+(costs[1]+4),dp[1]+(costs[1]+1));
        for(int i=3;i<=n;i++){
            int s1=dp[i-1]+costs[i-1]+( ( i-(i-1) )*( i-(i-1) ) );
            int s2=dp[i-2]+costs[i-1]+( ( i-(i-2) )*( i-(i-2) ) );
            int s3=dp[i-3]+costs[i-1]+( ( i-(i-3) )*( i-(i-3) ) );
            dp[i]=Math.min(s1,Math.min(s2,s3));
        }
        return dp[n];
    }

}