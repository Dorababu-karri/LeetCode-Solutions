class Solution {
    static int n,piles[],prefix[],dp[][];
    public int stoneGameII(int[] piles) {
        this.n=piles.length;
        this.piles=piles;
        prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+piles[i];
        }
        dp=new int[n][n+1];
        for(int i=0;i<n;i++){
             Arrays.fill(dp[i],-1);
        }
        return function(0,1);

    }
    public int function(int idx,int M){
        if(idx>=n) return 0;
        int stones=0;
        if(dp[idx][M]!=-1) return dp[idx][M];
        for(int X=1;X<=2*M && (idx+X)<=n;X++){
            int currentStones=prefix[idx+X]-prefix[idx];
            int totalStones=prefix[n]-prefix[idx+X];
            int nextStones=function(idx+X,Math.max(M,X));
            stones=Math.max(stones,currentStones+totalStones-nextStones);
        }
        return dp[idx][M]=stones;
    }
}